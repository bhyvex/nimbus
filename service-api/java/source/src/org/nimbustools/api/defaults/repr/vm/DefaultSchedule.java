/*
 * Copyright 1999-2008 University of Chicago
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.nimbustools.api.defaults.repr.vm;

import org.nimbustools.api._repr.vm._Schedule;

import java.util.Calendar;
import java.text.DateFormat;

public class DefaultSchedule implements _Schedule {

    // -------------------------------------------------------------------------
    // STATIC VARIABLES
    // -------------------------------------------------------------------------

    private static final DateFormat localFormat = DateFormat.getDateTimeInstance();
    

    // -------------------------------------------------------------------------
    // INSTANCE VARIABLES
    // -------------------------------------------------------------------------

    private Calendar startTime;
    private int durationSeconds = -1;
    private Calendar destructionTime;


    // -------------------------------------------------------------------------
    // implements org.nimbustools.api.repr.vm.Schedule
    // -------------------------------------------------------------------------
    
    public Calendar getStartTime() {
        return this.startTime;
    }

    public int getDurationSeconds() {
        return this.durationSeconds;
    }

    public Calendar getDestructionTime() {
        return this.destructionTime;
    }

    
    // -------------------------------------------------------------------------
    // implements org.nimbustools.api._repr.vm._Schedule
    // -------------------------------------------------------------------------

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }
    
    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public void setDestructionTime(Calendar destructionTime) {
        this.destructionTime = destructionTime;
    }


    // -------------------------------------------------------------------------
    // DEBUG STRING
    // -------------------------------------------------------------------------
    
    public String toString() {
        return "DefaultSchedule{" +
                "startTime=" + calendarStr(this.startTime) +
                ", durationSeconds='" + this.durationSeconds +
                "', destructionTime='" + calendarStr(this.destructionTime) +
                "'}";
    }

    private static String calendarStr(Calendar cal) {
        if (cal == null) {
            return "null";
        }
        return localFormat.format(cal);
    }
}
