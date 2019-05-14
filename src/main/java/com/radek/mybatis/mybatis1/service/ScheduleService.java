package com.radek.mybatis.mybatis1.service;

import com.radek.mybatis.mybatis1.entity.Schedule;
import com.radek.mybatis.mybatis1.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private ScheduleRepository scheduleRepository;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    public List<Schedule> findAllByVehicleId(Long vehicleId) {
        return scheduleRepository.findAllByVehicleId(vehicleId);
    }

    public List<Schedule> findAllByDriverId(Long driverId) {
        return scheduleRepository.findAllByDriverId(driverId);
    }

    public List<Schedule> findAllByVehicleIdAndDriverId(Long vehicleId, Long driverId) {
        return scheduleRepository.findAllByVehicleIdAndDriverId(vehicleId, driverId);
    }

    public List<Schedule> findAllByDriverIdAndStartStop(Long driverId, String startStop) {
        return scheduleRepository.findAllByDriverIdAndStartStop(driverId, startStop);
    }

    public List<Schedule> findAllByStartStop(String startStop) {
        return scheduleRepository.findAllByStartStop(startStop);
    }

    public List<Schedule> findAllByVehicleIdAndStartStop(Long vehicleId, String startStop) {
        return scheduleRepository.findAllByVehicleIdAndStartStop(vehicleId, startStop);
    }

    public List<Schedule> findAllByVehicleIdAndDriverIdAndStartStop(Long vehicleId, Long driverId, String startStop) {
        return scheduleRepository.findAllByVehicleIdAndDriverIdAndStartStop(vehicleId, driverId, startStop);
    }
}
