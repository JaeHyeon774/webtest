CREATE TABLE memo (
    memono number(7) not null,
    wname varchar(20) not null,
    title varchar(100) not null,
    content varchar (4000) not null,
    passwd varchar(15) not null,
    viewcnt number(5) default 0,
    wdate DATE not null,
    primary key (memono)
);

insert into memo(memono, wname, title, content, passwd, wdate)
values((select nvl(max(memono),0)+1 from memo),
'홍길동', '오늘의 일정', '2시 점심약속', '1234' sysdate);