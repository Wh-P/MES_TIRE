package com.web.mes_tire.Quality_test.vo;

public class Performance_standard {
		private double weight;
		private double max_speed;
		private double min_speed;
		public Performance_standard() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Performance_standard(double weight, double max_speed, double min_speed) {
			super();
			this.weight = weight;
			this.max_speed = max_speed;
			this.min_speed = min_speed;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public double getMax_speed() {
			return max_speed;
		}
		public void setMax_speed(double max_speed) {
			this.max_speed = max_speed;
		}
		public double getMin_speed() {
			return min_speed;
		}
		public void setMin_speed(double min_speed) {
			this.min_speed = min_speed;
		}
		
}
