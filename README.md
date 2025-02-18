## MES 프로젝트 "WIND - TIRE"
![tire-main](https://github.com/user-attachments/assets/a47f7536-9cc4-4843-a4af-d9bc4430cfd6)


## 시연 영상
[![시연 영상](https://img.youtube.com/vi/1sEOsvN_loM/maxresdefault.jpg)](https://www.youtube.com/watch?v=1sEOsvN_loM)
### 사진을 클릭 시 영상실행 되어집니다

<br>

## 프로젝트 소개

- MES 시스템인 "WIND - TIRE" 라는 시스템을 만들었습니다. 해당 시스템은, 발주 일정에 맞게 타이어를 생산하고 관리하는 시스템입니다.

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
  <tr>
     <td align="center"> 생산스케줄 계획/관리, 완제품/부자재 발주서 관리 기능 담당 </td>
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
  -MES 생산 공정의 실시간 모니터링과 발주 일정에 맞춘 생산 계획을 수립할 수 있게, Bootstrap 캘린더 기능을 활용하여 구현하였습니다.<br>
  그리고 발주 일정과 부자재 발주 일정을 등록하여 생산 계획 달력에서 한눈에 확인할 수 있으며,<br>
  이를 기반으로 체계적인 생산 스케줄을 수립할수 있는 기능을 만들었습니다. 

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

# 5.구현화면/상세코드

## 5-1.Main 화면 **[Schedule_Order.jsp]** 

<h3>각 공정에서 만들어지는 공정별 생산량,부자재 재고 등을 실시간 으로 나타내기 위해,<br>
BOOTSTRAP 의 각 차트(CARD,PIE,AREA)를 활용하였습니다 </h3>


![main_tire](https://github.com/user-attachments/assets/cd7b859e-7ddc-4e01-a5ed-b49c082f64f9)


### &#9312; 상세 설명

**Card-Example**

![card-exam](https://github.com/user-attachments/assets/cf45ea7c-5803-4ce3-b311-2a8f10c4d9ae)

**AREA-CHART**

![area-chart](https://github.com/user-attachments/assets/62c0c2ec-17fa-47d0-a17c-1e07b152ea8c)

**PIE-CHART**
 
![piechart](https://github.com/user-attachments/assets/9dc624a0-ed42-45dd-bd83-1d6cfedd1015)



**사이드 바 리스트**

![lists](https://github.com/user-attachments/assets/3aabd757-eab5-4b42-a862-51d38649a9be)



<h2>5-2.생산계획 화면(Scheduler)</h2>

<h3>리스트의 "생산계획 관리" 를 클릭 시 <br>  해당 페이지가 출력이 되고 달력의 날짜 를 클릭시 <br> MODAL 창 기능을 통해 서버에 입력된 데이터를 전송 합니다</h3>

### &#9312; 상세 설명

![image](https://github.com/user-attachments/assets/0218a493-28e1-4831-b2b5-c6478f5ecaaf)

<br>



<h2>5-3.완제품/부자재 발주관리 화면</h3>



<h3>리스트의 "완제품 발주관리" 를 클릭 시 해당 화면이 띄워 집니다</h3>


### &#9312; 상세 설명
![getPurorderListMain](https://github.com/user-attachments/assets/fceaca52-9366-46f7-8f14-98b7f39c6ccb)


<h3>등록 버튼을 누르고, 발주서 작성을 띄어진 MODAL 창을 통해 입력값을 작성 하고 "작성" 버튼을 누르면 서버에 전송 됩니다.</h3>


![modal_submit_](https://github.com/user-attachments/assets/e9f9f43d-155e-4bd7-92df-722923da0471)


<h3>등록 된 후 해당 발주서 리스트를 클릭 시</h3>

![click](https://github.com/user-attachments/assets/8bf4df4d-d3f5-4386-bbce-1e28e2895b80)


<h3>해당 발주서의 내용을 수정 할수 있는 모달창안에 정보가 보이고 <br>
내용을 수정 한뒤 수정, 삭제 버튼을 누르면<br>
해당 기능이 동작하게 하였습니다.</h3>

![purorder](https://github.com/user-attachments/assets/e7f11819-38e1-4950-be45-2412fecc8ec1)


<h3>해당 발주 리스트는 "생산 계획 관리"에서도 확인이 가능하며<br>
발주 리스트에 맞게 생산 스케줄을 작성할 수 있게 됩니다.</h3>

![click3](https://github.com/user-attachments/assets/a6ba4c23-a320-4a7d-89fb-efca0e367fb7)

<h3>클릭 시 해당 발주 리스트를 확인 하실 수 있습니다. </h3>

![click4](https://github.com/user-attachments/assets/dec2b60a-8cd7-4d4f-a2d3-9d22649af1c6)



<br>
<br>

## 6.테이블 구조/설계

![tables](https://github.com/user-attachments/assets/35754dde-6382-4006-80b1-abab944f0179)



