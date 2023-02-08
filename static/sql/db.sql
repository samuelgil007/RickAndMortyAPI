-- bpdoybskjnuvyypa2vwe.episode definition

CREATE TABLE `episode` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `air_date` varchar(255) DEFAULT NULL,
  `created` varchar(255) DEFAULT NULL,
  `episode` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- bpdoybskjnuvyypa2vwe.location definition

CREATE TABLE `location` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `dimension` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- bpdoybskjnuvyypa2vwe.`characters` definition

CREATE TABLE `characters` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `species` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `id_location` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnyphe54548hwjl2c4fg22corr` (`id_location`),
  CONSTRAINT `FKnyphe54548hwjl2c4fg22corr` FOREIGN KEY (`id_location`) REFERENCES `location` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- bpdoybskjnuvyypa2vwe.episode_by_character definition

CREATE TABLE `episode_by_character` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `id_characters` bigint NOT NULL,
  `id_episode` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2alnimosten3r8lhijcom15ut` (`id_characters`),
  KEY `FKeoy6qbego1a6rwvr1xtbucg0n` (`id_episode`),
  CONSTRAINT `FK2alnimosten3r8lhijcom15ut` FOREIGN KEY (`id_characters`) REFERENCES `characters` (`id`),
  CONSTRAINT `FKeoy6qbego1a6rwvr1xtbucg0n` FOREIGN KEY (`id_episode`) REFERENCES `episode` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;