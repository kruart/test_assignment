DROP TABLE IF EXISTS line;

CREATE TABLE line (
  id INT AUTO_INCREMENT PRIMARY KEY,
  value_of_line VARCHAR(256) NOT NULL,
  counter INT NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;