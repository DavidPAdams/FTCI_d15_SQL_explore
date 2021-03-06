INSERT INTO user
(
  user_id,
  first_name, 
  last_name,
  age,
  created_at
)  
VALUES 
( 
  1,
  'Tom', 
  'Clancy', 
  66,
  CURRENT_DATE
);

INSERT INTO user
(
  user_id,
  first_name, 
  last_name,
  age,
  created_at
)  
VALUES 
( 
  2,
  'Stephen', 
  'King', 
  72,
  CURRENT_TIMESTAMP
);

INSERT INTO user 
(
  user_id,
  first_name, 
  last_name,
  age,
  created_at
)  
VALUES 
( 
  3,
  'Dan', 
  'Brown', 
  55,
  CURRENT_TIMESTAMP
);

INSERT INTO user 
(
  user_id,
  first_name, 
  last_name,
  age,
  created_at
)  
VALUES 
( 
  4,
  'J. K.', 
  'Rowling', 
  54,
  CURRENT_TIMESTAMP
);

INSERT INTO user 
(
  user_id,
  first_name, 
  last_name,
  age,
  created_at
)  
VALUES 
( 
  5,
  'Dean', 
  'Koonts', 
  74,
  CURRENT_TIMESTAMP
);

INSERT INTO user 
(
  user_id,
  first_name, 
  last_name,
  age,
  created_at
)  
VALUES 
( 
  6,
  'Clive', 
  'Cussler', 
  88,
  CURRENT_TIMESTAMP
);

--For values that are dates, put in single quotes in 
--the format yyyy-mm-dd
INSERT INTO favorite 
(
  favorite_id,
  title, 
  author,
  published,
  created_at
)  
VALUES 
( 
  1,
  'The Hunt for Red October', 
  'Clancy', 
  '1984-10-01',
  CURRENT_TIMESTAMP
);

--Use escape \ to use apostrophy in string
INSERT INTO favorite 
(
  favorite_id,
  title, 
  author,
  published,
  created_at
  )  
VALUES 
( 
  2,
  '\'Salem\'s Lot', 
  'King', 
  '1975-10-17',
  CURRENT_TIMESTAMP
);

INSERT INTO favorite 
(
  favorite_id,
  title, 
  author,
  published,
  created_at
)  
VALUES 
( 
  3,
  'The Da Vinci Code', 
  'Brown', 
  '2003-04-01',
  CURRENT_TIMESTAMP
);

INSERT INTO favorite 
(
  favorite_id,
  title, 
  author,
  published,
  created_at
)  
VALUES 
( 
  4,
  'Harry Potter and the Goblet of Fire', 
  'Rowling', 
  '2000-07-08',
  CURRENT_TIMESTAMP
);

INSERT INTO favorite 
(
  favorite_id,
  title, 
  author,
  published,
  created_at
)  
VALUES 
( 
  5,
  'Strangers', 
  'Koontz', 
  '1986-01-01',
  CURRENT_TIMESTAMP
);

INSERT INTO favorite 
(
  favorite_id,
  title, 
  author,
  published,
  created_at
)  
VALUES 
( 
  6,
  'The Sea Hunters', 
  'Cussler', 
  '1996-01-01',
  CURRENT_TIMESTAMP
);

