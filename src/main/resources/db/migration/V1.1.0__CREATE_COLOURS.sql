CREATE TABLE IF NOT EXISTS COLOURS (
    id bigint NOT NULL GENERATED BY DEFAULT AS IDENTITY(INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1),
    name character varying(30) NOT NULL
);

ALTER TABLE COLOURS OWNER TO closet_own;
GRANT SELECT, INSERT, UPDATE, DELETE ON COLOURS TO closet_own;
GRANT SELECT ON COLOURS TO closet_own;