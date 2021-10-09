package com.example;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class Result {
    public MacAddress getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(MacAddress macAddress) {
        this.macAddress = macAddress;
    }

    @JsonSerialize(using = ToStringSerializer.class)
    private MacAddress macAddress;

    public Result(MacAddress macAddress) {
        this.macAddress = macAddress;
    }
}
