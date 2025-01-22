package com.web.mes_tire.Quality_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




//http://localhost:5050/api/generate-normal-distribution
@RestController
@RequestMapping("/api")
public class ChartController {
	@Autowired(required=false)
	private A02_Service service;
 	// http://localhost:3333/api/getPerformance_standardList
	@RequestMapping("getPerformance_standardList")
	public ResponseEntity<?> getPerformance_standardList(){
		return ResponseEntity.ok(service.getPerformance_standardList());
	}
	@GetMapping("/generate-normal-distribution")
    public NormalDistributionData getNormalDistribution() {
        double mean = 0;
        double stdDev = 0.5;
        
        List<Double> xValues = new ArrayList<>();
        List<Double> yValues = new ArrayList<>();
        
        for (int i = -50; i <= 50; i++) {
            double x = i * 0.1;
            double y = (1 / (stdDev * Math.sqrt(2 * Math.PI))) * Math.exp(-0.5 * Math.pow((x - mean) / stdDev, 2));
            xValues.add(x);
            yValues.add(y);
        }

        return new NormalDistributionData(xValues, yValues);
    }
    
    // JSON으로 반환할 데이터 클래스
    public static class NormalDistributionData {
        private List<Double> labels;
        private List<Double> values;
        public NormalDistributionData(List<Double> labels, List<Double> values) {
            this.labels = labels;
            this.values = values;
        }

        public List<Double> getLabels() {
            return labels;
        }
        public void setLabels(List<Double> labels) {
            this.labels = labels;
        }
        public List<Double> getValues() {
            return values;
        }
        public void setValues(List<Double> values) {
            this.values = values;
        }
    }

    
}