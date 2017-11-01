/*
 *  Copyright (c) 2016, University of Oslo
 *  * All rights reserved.
 *  *
 *  * Redistribution and use in source and binary forms, with or without
 *  * modification, are permitted provided that the following conditions are met:
 *  * Redistributions of source code must retain the above copyright notice, this
 *  * list of conditions and the following disclaimer.
 *  *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *  * this list of conditions and the following disclaimer in the documentation
 *  * and/or other materials provided with the distribution.
 *  * Neither the name of the HISP project nor the names of its contributors may
 *  * be used to endorse or promote products derived from this software without
 *  * specific prior written permission.
 *  *
 *  * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 *  * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 *  * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 *  * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 *  * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 *  * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package org.hisp.dhis.android.sdk.ui.fragments.eventdataentry;

import org.hisp.dhis.android.sdk.persistence.models.Enrollment;
import org.hisp.dhis.android.sdk.persistence.models.TrackedEntityAttributeValue;
import org.hisp.dhis.android.sdk.ui.adapters.rows.dataentry.IndicatorRow;
import org.hisp.dhis.android.sdk.persistence.models.DataValue;
import org.hisp.dhis.android.sdk.persistence.models.Event;
import org.hisp.dhis.android.sdk.persistence.models.ProgramStage;
import org.hisp.dhis.android.sdk.ui.adapters.rows.dataentry.StatusRow;
import org.hisp.dhis.android.sdk.ui.fragments.dataentry.DataEntryFragmentSection;

import java.util.List;
import java.util.Map;

class EventDataEntryFragmentForm {
    private Enrollment enrollment;
    private Event event;
    private ProgramStage stage;
    private List<DataEntryFragmentSection> sections;
    private DataEntryFragmentSection currentSection;
    private Map<String, DataValue> dataValues;
    private Map<String, TrackedEntityAttributeValue> trackedEntityAttributeValues;
    private Map<String, String> dataElementNames;
    private List<IndicatorRow> indicatorRows;
    private StatusRow statusRow;
    private Map<String, IndicatorRow> indicatorToIndicatorRowMap;

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    public void setSections(List<DataEntryFragmentSection> sections) {
        this.sections = sections;
    }

    public List<DataEntryFragmentSection> getSections() {
        return sections;
    }

    public void setStage(ProgramStage stage) {
        this.stage = stage;
    }

    public ProgramStage getStage() {
        return stage;
    }

    public Map<String, DataValue> getDataValues() {
        return dataValues;
    }

    public void setDataValues(Map<String, DataValue> dataValues) {
        this.dataValues = dataValues;
    }

    public Map<String, String> getDataElementNames() {
        return dataElementNames;
    }

    public void setDataElementNames(Map<String, String> dataElementNames) {
        this.dataElementNames = dataElementNames;
    }

    public List<IndicatorRow> getIndicatorRows() {
        return indicatorRows;
    }

    public void setIndicatorRows(List<IndicatorRow> indicatorRows) {
        this.indicatorRows = indicatorRows;
    }

    public DataEntryFragmentSection getCurrentSection() {
        return currentSection;
    }

    public void setCurrentSection(DataEntryFragmentSection currentSection) {
        this.currentSection = currentSection;
    }

    public StatusRow getStatusRow() {
        return statusRow;
    }

    public void setStatusRow(StatusRow statusRow) {
        this.statusRow = statusRow;
    }

    public Map<String, IndicatorRow> getIndicatorToIndicatorRowMap() {
        return indicatorToIndicatorRowMap;
    }

    public void setIndicatorToIndicatorRowMap(Map<String, IndicatorRow> indicatorToIndicatorRowMap) {
        this.indicatorToIndicatorRowMap = indicatorToIndicatorRowMap;
    }

    public Map<String, TrackedEntityAttributeValue> getTrackedEntityAttributeValues() {
        return trackedEntityAttributeValues;
    }

    public void setTrackedEntityAttributeValues(Map<String, TrackedEntityAttributeValue> trackedEntityAttributeValues) {
        this.trackedEntityAttributeValues = trackedEntityAttributeValues;
    }
}