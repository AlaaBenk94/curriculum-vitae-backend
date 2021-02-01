CREATE TABLE public.profile
(
    id           int8 NOT NULL,
    "version"    int8 NULL,
    about_me     text NULL,
    email        varchar(80) NULL,
    first_name   varchar(50) NULL,
    last_name    varchar(50) NULL,
    phone_number varchar(12) NULL,
    nicknames    varchar(255) NULL,
    CONSTRAINT pk_profile PRIMARY KEY (id)
);

CREATE TABLE public.formation_entry
(
    id          int8 NOT NULL,
    "version"   int8 NULL,
    institution varchar(255) NULL,
    city        varchar(255) NULL,
    country     varchar(255) NULL,
    description text NULL,
    title       varchar(255) NULL,
    "date"      date NULL,
    profile_id  int8 NULL,
    CONSTRAINT pk_formation_entry PRIMARY KEY (id)
);

CREATE TABLE public.experience_entry
(
    id          int8 NOT NULL,
    "version"   int8 NULL,
    institution varchar(255) NULL,
    city        varchar(255) NULL,
    country     varchar(255) NULL,
    description varchar(255) NULL,
    title       varchar(255) NULL,
    end_date    date NULL,
    start_date  date NULL,
    profile_id  int8 NULL,
    tags        varchar(255) NULL,
    CONSTRAINT pk_experience_entry PRIMARY KEY (id)
);

CREATE TABLE public.skill
(
    id         int8 NOT NULL,
    "version"  int8 NULL,
    percentage int4 NULL,
    title      varchar(255) NULL,
    profile_id int8 NULL,
    CONSTRAINT skill_pkey PRIMARY KEY (id)
);

ALTER TABLE public.experience_entry
    ADD CONSTRAINT fk_experience_entry_profile FOREIGN KEY (profile_id) REFERENCES profile (id);
ALTER TABLE public.formation_entry
    ADD CONSTRAINT fk_formation_entry_profile FOREIGN KEY (profile_id) REFERENCES profile (id);
ALTER TABLE public.skill
    ADD CONSTRAINT fk_skill_profile FOREIGN KEY (profile_id) REFERENCES profile (id);
