drop table if exists booking_dates;
drop table if exists hotel_bookings;

create table hotel_bookings (
	id INT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR2(250) NOT NULL,
	last_name VARCHAR2(250) NOT NULL,
	total_price DOUBLE,
	deposit_paid BOOLEAN,
	additional_needs VARCHAR2(250)
);

create table booking_dates(
	booking_id INT,
	check_in_dt VARCHAR2(250),
	check_out_dt VARCHAR2(250)
);