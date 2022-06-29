/*
ENUMS: gender, goal, activity level, unit of measurement
*/

create table genders (
    id integer primary key,
    gender text not null
);

insert into genders (id, gender) values (0, 'male');
insert into genders (id, gender) values (1, 'female');

create table weight_goals (
    id integer primary key,
    goal text not null
);

insert into goals (id, goal) values (0, 'lose fast');
insert into goals (id, goal) values (1, 'lose normal');
insert into goals (id, goal) values (2, 'maintain');
insert into goals (id, goal) values (3, 'gain normal');
insert into goals (id, goal) values (4, 'gain fast');

create table activity_levels (
    id integer primary key,
    activity text not null 
);

insert into activity_levels (id, activity) values (0, 'sedentary');
insert into activity_levels (id, activity) values (1, 'lightly active');
insert into activity_levels (id, activity) values (2, 'moderately active');
insert into activity_levels (id, activity) values (3, 'very active');
insert into activity_levels (id, activity) values (4, 'extremly active');

create table units_of_measurement (
    id integer primary key
    unit text not null
);

insert into units_of_measurement (id, unit) values (0, 'US(in/lbs)');
insert into units_of_measurement (id, unit) values (1, 'Metric(cm/kg)');