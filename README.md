## MES 프로젝트 "Wind tire"
![tire-main](https://github.com/user-attachments/assets/a47f7536-9cc4-4843-a4af-d9bc4430cfd6)


## 시연 영상
[![시연 영상](https://img.youtube.com/vi/1sEOsvN_loM/maxresdefault.jpg)](https://www.youtube.com/watch?v=1sEOsvN_loM)

<br>

## 프로젝트 소개

- MES 시스템인 "wind-tire" 라는 시스템을 만들었습니다. 해당 시스템은 타이어를 생산해내는 시스템입니다.

<br>


## 팀원 구성

<div align="center">

<table  align="center">
  <tr>
    <th><img src="https://avatars.githubusercontent.com/u/162407926?v=4" width="150" height="150" "/></th>
  </tr>
  <tr>
    <td align="center"> 박우혁</td>
  </tr>
</table>
</div>

<br>

## 1. 개발 환경
- Tool :Spring Tool Suite 4 
- 버전 및 이슈관리 : Github, SVN
<br>

## 2. 채택한 개발 기술

![tire-stack](https://github.com/user-attachments/assets/55737e10-2b96-4023-90a6-9cab6f78382f)

<br/>

## 3. 역할 분담

### 박우혁
- **기능**
    -MES 생산 공정의 실시간 상황들과,발주 일정에 맞춘  생산계획을 bootstrap 캘린더 기능을 통해 세우고, 발주일정,부자재 발주 일정등을 삭제, 하는 기능을 구현 하였습니다.

<br>

## 4. 개발 기간 및 작업 관리

### 개발 기간

- 전체 개발 기간 : 2025-01-01~2025-01-30
- 기획 : 2025-01-01 ~ 2025-01-07
- UI 구현 : 2025-01-01 ~ 2025-01-10
- 기능 구현 : 2025-01-11~ 2025-01-30

<br>

### 작업 관리

- GitHub 사용하여 파일 상태관리를 진행하였습니다.

<br>

## 5.구현화면/내용

<h3>1.Main 화면</h3>

![tire-schedule](https://github.com/user-attachments/assets/e0cd3eb4-b920-40cd-bb3d-f8ac560f1cc4)


#### <상세설명>
<br>
-bootstrap 을 활용하여 전반적인 내용의 스타일링을 하였습니다 <br>
-piechart,AreaChart 를 활용하였습니다.<br>
<br>
<br>


<h3>2.생산계획 화면(Scheduler)</h3>

![calendar](https://github.com/user-attachments/assets/63f86c6d-a89d-4430-9627-2d7e9b35722e)


#### <상세설명>
<br>
-bootstrap Calendar 를 사용하여 해당 기능을 구현하였습니다  <br>
-Javascript 의 ajax  기능을 사용하여 api 데이터를 불러와 기능을 구현하였습니다.<br>
<br>


<h3>3.완제품/부자재 발주관리 화면</h3>


1)![order](https://github.com/user-attachments/assets/b0fbc4b8-a4e1-4851-8604-31d2ab7a2127)


2)![order(2)](https://github.com/user-attachments/assets/3fd09cc3-4021-4930-a00c-f6c871a881df)




#### <상세설명>
<br>
-스프링부트를 이용해 데이터의 내용을 json 형태로 가지고 온뒤, mapping 을 통해 api화 시켰습니다  <br>
-Javascript 의 ajax  기능을 사용하여 api 데이터를 불러와 기능을 구현하였습니다.<br>
-가져오기 외에 update delete 기능을 추가하여 페이지 에서 전송내용을 서버에 전달하였습니다.
<br>
<br>

## 6.테이블 구조/설계

![tables](https://github.com/user-attachments/assets/35754dde-6382-4006-80b1-abab944f0179)



