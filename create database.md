1. mysql 서버에 nomadclone 이라는 이름으로 데이터베이스 생성

2. 아래의 sql문을 실행시켜 table을 생성하고 카테고리 초기 데이터 넣어두기

```sql
CREATE TABLE `post` (
  `id` int NOT NULL,
  `title` varchar(45) DEFAULT NULL,
  `writer` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `category_id` varchar(45) DEFAULT NULL,
  `likes` int DEFAULT NULL,
  `comment_num` int DEFAULT NULL,
  `content` mediumtext,
  `writer_photo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `category` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

```sql
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (1, "all");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (2, "to-do-list");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (3, "html_css");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (4, "javascript");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (5, "bla-bla");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (6, "python");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (7, "side_projects");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (8, "hello");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (9, "dev_resources");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (10, "jobs");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (11, "react");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (12, "uber_eats");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (13, "announcement");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (14, "instaclone");
INSERT INTO `nomadclone`.`category` (`id`, `name`) VALUES (15, "type_test");
```

```sql
INSERT INTO `nomadclone`.`post`
(`id`, `title`, `writer`, `created_date`, `category_id`, `likes`, `comment_num`, `content`, `writer_photo`)
VALUES
(1, "dsf", "sdfsdf","2021-06-02 14:11:09", 5, 12, 34, "sdflsadkfjwefnvkwef", "http://sdf.png");
INSERT INTO `nomadclone`.`post`
(`id`, `title`, `writer`, `created_date`, `category_id`, `likes`, `comment_num`, `content`, `writer_photo`)
VALUES
(2, "dsf", "sdfsdf","2021-06-02 18:11:09", 5, 12, 34, "sdflsadkfjwefnvkwef", "http://sdf.png");
```

