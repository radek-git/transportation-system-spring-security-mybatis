package com.radek.mybatis.mybatis1;

public class AppConstants {

    private AppConstants() {
    }

    public static final String SELECT_TRANSPORT_TYPE
            = "com.radek.mybatis.mybatis1.repository.TransportTypeRepository.findOne";

    public static final String SELECT_LINE_SCHEDULE_BY_LINE_ID
            = "com.radek.mybatis.mybatis1.repository.LineScheduleRepository.findAllByLineId";

    public static final String SELECT_STOP_SCHEDULE_BY_STOP_ID =
            "com.radek.mybatis.mybatis1.repository.StopScheduleRepository.findAllByStopId";

    public static final String SELECT_STOP_BY_ID = "com.radek.mybatis.mybatis1.repository.StopRepository.findById";

    public static final String SELECT_LINE_BY_ID = "com.radek.mybatis.mybatis1.repository.LineRepository.findById";

    public static final String SELECT_VEHICLE_BY_ID =
            "com.radek.mybatis.mybatis1.repository.VehicleRepository.findById";

    public static final String SELECT_DRIVER_BY_ID =
            "com.radek.mybatis.mybatis1.repository.DriverRepository.findById";

    public static final String SELECT_DAY_OF_WEEK_BY_ID =
            "com.radek.mybatis.mybatis1.repository.DayOfWeekRepository.findById";




}
