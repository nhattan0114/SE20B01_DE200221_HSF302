package com.de200221.mvc.repository;

import com.de200221.mvc.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

    // Q1.1 - default list ordered by InstallationDate descending
    List<Device> findAllByOrderByInstallationDateDesc();

    // Q1.2 - wildcard (partial, case-insensitive) search ordered by Installation Date
    List<Device> findByDeviceNameContainingIgnoreCaseOrderByInstallationDateDesc(String deviceName);

    // Q3 Screen Definition #1 - Device Code must be unique
    Optional<Device> findByDeviceCode(String deviceCode);
}
