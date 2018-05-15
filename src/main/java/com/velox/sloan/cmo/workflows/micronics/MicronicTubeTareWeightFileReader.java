package com.velox.sloan.cmo.workflows.micronics;

import java.util.List;
import java.util.Map;

public interface MicronicTubeTareWeightFileReader {
    public List<Map<String, Object>> readNewTubeRecordsFromFileData(String[] fileData);
}
