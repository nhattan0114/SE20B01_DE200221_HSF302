package fu.de200221;

import fu.de200221.dao.DepartmentDAO;
import fu.de200221.pojo.Department;
import fu.de200221.pojo.Employee;
import fu.de200221.pojo.Gender;
import fu.de200221.util.JPAUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DepartmentDAO departmentDAO = new DepartmentDAO();

        // ==========================================
        // TODO 2.7: Demo lưu Department và cascade Employee
        // ==========================================
        System.out.println("--- TODO 2.7: CREATE & CASCADE ---");
        Department it = new Department("Marketing", "Ha Noi");
        Employee e1 = new Employee("aa.nguyen@company.com", "Nguyen Van A", Gender.MALE,
                new BigDecimal("15000000"), LocalDate.of(2022, 1, 10));
        Employee e2 = new Employee("bb.tran@company.com", "Tran Thi B", Gender.FEMALE,
                new BigDecimal("18000000"), LocalDate.of(2021, 6, 1));
        Employee e3 = new Employee("cc.le@company.com", "Le Van C", Gender.OTHER,
                new BigDecimal("12000000"), LocalDate.of(2023, 3, 15));

        // Dùng helper method đồng bộ 2 chiều
        it.addEmployee(e1);
        it.addEmployee(e2);
        it.addEmployee(e3);

        // Chỉ cần save(department), cascade = ALL sẽ tự lưu Employee
        departmentDAO.save(it);
        System.out.println("Da luu Department, id = " + it.getId());

        // Tìm lại bằng JOIN FETCH
        Department found = departmentDAO.findByIdWithEmployees(it.getId());
        System.out.println("Phong ban: " + found.getName());
        for (Employee e : found.getEmployees()) {
            System.out.println("  - " + e);
        }

        // Tạo thêm 1 phòng ban nữa để test N+1
        Department hr = new Department("HR", "Da Nang");
        Employee e4 = new Employee("dd.pham@company.com", "Pham Van D", Gender.MALE,
                new BigDecimal("11000000"), LocalDate.now());
        hr.addEmployee(e4);
        departmentDAO.save(hr);


        // ==========================================
        // TODO 2.8: Tái hiện N+1 Query Problem
        // ==========================================
        System.out.println("\n--- TODO 2.8: N+1 PROBLEM (Kiem tra log console) ---");

        // Mở EntityManager trực tiếp ở đây để duy trì Session trong lúc lặp
        jakarta.persistence.EntityManager em = JPAUtil.getEMF().createEntityManager();
        try {
            // 1 câu SELECT lấy tất cả Department
            List<Department> departmentsLazy = em.createQuery("SELECT d FROM Department d", Department.class).getResultList();

            for (Department d : departmentsLazy) {
                System.out.println("Dept: " + d.getName());
                // Lúc này EntityManager vẫn đang mở, Hibernate sẽ gọi thêm N câu SELECT để lấy Employee
                System.out.println("So nhan vien: " + d.getEmployees().size());
            }
        } finally {
            em.close(); // Đóng EntityManager sau khi đã hoàn tất việc lazy load
        }

        JPAUtil.close();
    }
}