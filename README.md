🏨 Hotel Booking Cancellation Analysis

A real-world business problem solved using data analytics.

🎯 Business Objective

Hotels face high cancellation rates → revenue loss + poor planning.
This project aims to:

Identify key cancellation patterns

Estimate revenue loss

Recommend business strategies to increase profit

This is a business decision-making project, not just EDA.

📦 Dataset Overview
Attribute	Details
Total Rows	119,000+
Time Period	2015–2017
Target Variable	is_canceled (0 = No, 1 = Yes)
Major Features	adr, lead_time, hotel, market_segment, customer_type, stays_in_week_nights, reservation_status_date
Source	Kaggle – Hotel Booking Demand Dataset
🔁 Project Workflow
flowchart LR
A[Define Business Problem] --> B[Load & Explore Data]
B --> C[Data Cleaning & Preprocessing]
C --> D[Exploratory Data Analysis]
D --> E[Revenue & KPI Calculation]
E --> F[Insights & Strategy]

🧹 Data Cleaning Summary

Converted reservation dates to datetime

Dropped high-null columns: company, agent

Removed outliers (adr > 5000)

Removed all missing values

Created new metric: total_revenue

Final dataset clean and ready for EDA

📊 Key EDA Visuals

(Place your images from the /images folder)

Overall Cancellation Percentage

Cancellation by Hotel Type

City Hotels cancel more → higher risk

ADR Trend (City vs Resort)

Higher ADR → higher cancellation

Monthly Cancellation Trend

Clear seasonal spikes

Revenue Lost vs Earned

💰 Revenue Impact
Metric	Value (₹)
Estimated Revenue Lost	₹16,705,837.66
Revenue Earned	₹25,908,964.82
Avg. Revenue per Booking	₹358.42
Target After Optimization	₹420+

Interpretation:
Only 61% of potential revenue is realized.
A 10% reduction in cancellations → ₹4–8 crore annual gain.

🔎 Business Insights
Finding	Meaning
High cancellations (37.2%)	Major revenue leak
City Hotels cancel more	Lower reliability
OTA & Group bookings cancel most	Price-sensitive users
Direct bookings cancel least	Promote this channel
High ADR ↑ → Cancellations ↑	Pricing issue
Seasonal spikes	Forecasting needed
💡 Business Recommendations
Problem	Recommendation
OTA/Group users cancel often	Retention offers
High ADR months	Dynamic pricing
Low direct bookings	Loyalty program
OTA listing issues	Better photos & info
Seasonal cancellation trend	Forecast & adjust
📈 Expected Business Impact
Metric	Current	Target
Cancellation Rate	37%	25–28%
Avg. Revenue/Booking	₹358	₹420+
Direct Bookings	18%	30%
Revenue Lost	₹1.67 Cr	↓ 35%
📂 Project Structure
Hotel-Booking-Analysis
│── data/
│── notebooks/
│   └── hotel_booking.ipynb
│── images/
│── README.md

📌 Conclusion

Reducing cancellations even slightly creates massive revenue benefits.
The strategies here are practical, data-backed, and immediately applicable.

📬 Contact

Name: Your Name
Email: your@email.com

LinkedIn | GitHub | Portfolio
