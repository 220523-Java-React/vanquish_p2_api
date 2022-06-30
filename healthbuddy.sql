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

insert into weight_goals (id, goal) values (0, 'lose fast');
insert into weight_goals (id, goal) values (1, 'lose normal');
insert into weight_goals (id, goal) values (2, 'maintain');
insert into weight_goals (id, goal) values (3, 'gain normal');
insert into weight_goals (id, goal) values (4, 'gain fast');

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
    id integer primary key,
    unit text not null
);

insert into units_of_measurement (id, unit) values (0, 'US(in/lbs)');
insert into units_of_measurement (id, unit) values (1, 'Metric(cm/kg)');

/*
TABLES for user_account, user_input, body_info, body_feedback, progress, nutrients, vitamins, minerals  
*/

create table user_account (
    user_id serial primary key,
    first_name text not null, 
    last_name text not null, 
    username text not null unique,
    password text not null,
    email text not null unique
);

create table user_input (
    input_id serial primary key,
    unit integer not null,
    gender integer not null,
    age integer not null,
    height double precision not null,
    weight double precision not null,
    waist double precision not null,
    neck double precision not null,
    hip double precision not null,
    activity integer not null,
    goal integer not null
);

/* Initial record */
create table body_info (
    info_id serial primary key,
    body_mass_index double precision,
    body_fat_percentage double precision,
    fat_mass double precision,
    lean_mass double precision,
    waist_to_height_ratio double precision,
    waist_to_hip_ratio double precision,
    basal_metabolic_rate double precision,
    ideal_body_weight double precision
);

/* Update */
create table body_feedback (
    feedback_id serial primary key,
    bmi_read text, 
    body_fat_percentage_read text,
    waist_to_height_read text,
    waist_to_hip_read text
);

/*
Let's talk about this table further
From JAVA, auto-create table from user account input (username)_progress
Each user has its own progress (row indicates weekly)
For example, user "anniek" creates anniek_progress
When calling specific user's progress table -> query = "select * from ?", query.set(1, 'anniek_progress')
*/

create table progress (
    progress_id serial primary key,
    date_of_input datetime, 
    unit integer not null,
    gender integer not null,
    age integer not null,
    height double precision not null,
    weight double precision not null,
    waist double precision not null,
    neck double precision not null,
    hip double precision not null,
    activity integer not null,
    goal integer not null
);

/* Update */
create table nutrients (
    nutrient_id serial primary key,
    user_id references user_account(user_id),
    calories double precision,
    carbs double precision,
    protein double precision,
    fat double precision,
    water double precision
);

/* Update */
create table vitamins (
    vit_a double precision,
    vit_c double precision,
    vit_d double precision,
    vit_e double precision,
    vit_k double precision,
    vit_b1 double precision,
    vit_b2 double precision,
    vit_b3 double precision,
    vit_b5 double precision,
    vit_b7 double precision,
    vit_b6, double precision,
    vit_b12 double precision,
    vit_b9 double precision
);

/* Update */
create table minerals (
    choline double precision,
    magnesium double precision,
    calcium double precision,
    zinc double precision,
    iron double precision,
    copper double precision,
    selenium double precision,
    manganese double precision,
    phosphorus double precision,
    potassium double precision,
    iodine double precision,
    chromium double precision,
    molybdenum double precision,
    fluoride double precision,
    sodium double precision,
    chloride double precision,
);