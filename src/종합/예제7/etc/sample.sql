# [1] 데이터베이스 생성
drop database if exists boardservice7;
create database boardservice7;
use boardservice7;
# [2] 테이블 생성
create table board(
	bno int unsigned auto_increment ,
    constraint primary key(bno),
    bcontent longtext not null,
    bwriter varchar(30) not null,
    bdate datetime default now()
);
# [3] 테이블 샘플 데이터 10개 (AI 시키기)
# 샘플 데이터 삽입
insert into board (bcontent, bwriter) values ('난당신이자꾸만밟혀서', '상철이자슥아');
insert into board (bcontent, bwriter) values ('누가 소설을 뒤부터 읽나', '백규민');
insert into board (bcontent, bwriter) values ('난 몇번이고몇번이고확답을줬습니다 그런데 눈치를 못챈건상철이니다!', '광수연지');
insert into board (bcontent, bwriter) values ('자바와 데이터베이스 연동 프로젝트 진행 중입니다. 피드백 부탁드려요.', '영숙');
insert into board (bcontent, bwriter) values ('질문 있습니다! auto_increment는 1부터 시작하나요?', '박주련');
insert into board (bcontent, bwriter) values ('오늘 점심 메뉴 추천받습니다. 돈까스 vs 김치찌개', '정란희');
insert into board (bcontent, bwriter) values ('게시판 서비스 구축이 생각보다 재밌네요.', '박승권');
insert into board (bcontent, bwriter) values ('테스트 데이터 8번입니다.', '박명수');
insert into board (bcontent, bwriter) values ('샘플 데이터입니다. 감사합니다.', '박진감');
insert into board (bcontent, bwriter) values ('마지막 샘플 데이터입니다. 감사합니다.', '박소영');
# 데이터 확인
select * from board;


# ctrl + s 저장하고 인텔리제이에 종합 예제7번 속에 etc라는 패키지 또 만들고 그 안에 지금 이 파일 sample이라 저장하기. 
# 그러고 그 다음에 다시 워크벤치 databse 에서 Reverse Engineer 누르고 ERD 다이어그램 만들기.
# 데이터모델 설계 끝!
