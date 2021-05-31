CREATE TABLE `post` (
                        `id` int NOT NULL,
                        `title` varchar(45) DEFAULT NULL,
                        `writer` varchar(45) DEFAULT NULL,
                        `created_date` datetime DEFAULT NULL,
                        `category_id` varchar(45) DEFAULT NULL,
                        `likes` int DEFAULT NULL,
                        `comment_num` int DEFAULT NULL,
                        `content` mediumtext,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `category` (
                            `id` int NOT NULL,
                            `name` varchar(45) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
