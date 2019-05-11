package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.dto.ScheduleDTO;
import com.radek.mybatis.mybatis1.mapper.ScheduleMapper;
import com.radek.mybatis.mybatis1.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScheduleController {

    private ScheduleService scheduleService;
    private ScheduleMapper scheduleMapper;

    @Autowired
    public ScheduleController(ScheduleService scheduleService, ScheduleMapper scheduleMapper) {
        this.scheduleService = scheduleService;
        this.scheduleMapper = scheduleMapper;
    }

    @GetMapping("/schedules")
    public List<ScheduleDTO> findAll(@RequestParam(required = false) Long vehicleId,
                                     @RequestParam(required = false) Long driverId,
                                     @RequestParam(required = false) String startStop) {

        //dopisać dodatkowe warunki uwzględniając startStop

        if (vehicleId == null && driverId == null && startStop == null) {
            return scheduleMapper.toDTO(scheduleService.findAll());
        }
        else if (vehicleId != null && driverId == null && startStop == null){
            return scheduleMapper.toDTO(scheduleService.findAllByVehicleId(vehicleId));
        }
        else if (driverId != null && vehicleId == null && startStop == null) {
            return scheduleMapper.toDTO(scheduleService.findAllByDriverId(driverId));
        }
        else if (vehicleId != null && driverId != null && startStop == null) {
            return scheduleMapper.toDTO(scheduleService.findAllByVehicleIdAndDriverId(vehicleId, driverId));
        }
        else if (vehicleId == null && driverId != null && startStop != null) {
            return scheduleMapper.toDTO(scheduleService.findAllByDriverIdAndStartStop(driverId, startStop));
        }
        else if (vehicleId == null && driverId == null && startStop != null) {
            return scheduleMapper.toDTO(scheduleService.findAllByStartStop(startStop));
        }
        else if (vehicleId != null && driverId == null && startStop != null) {
            return scheduleMapper.toDTO(scheduleService.findAllByVehicleIdAndStartStop(vehicleId, startStop));
        }
        else {
            return scheduleMapper.toDTO(scheduleService.findAllByVehicleIdAndDriverIdAndStartStop(vehicleId, driverId, startStop));
        }


    }
}
