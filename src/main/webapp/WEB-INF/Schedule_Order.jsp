<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<%--


 --%>
<html>
<head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title><%= request.getAttribute("pageTitle") != null ? request.getAttribute("pageTitle") : "생산계획/관리" %></title>

    <!-- Custom fonts for this template-->
    <link href="/a00_com/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="<%=request.getContextPath()%>/a00_com/css/sb-admin-2.min.css" rel="stylesheet">
</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

  
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/main">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-laugh-wink"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Wind tire</div>
            </a>
            <!-- Divider -->
            <hr class="sidebar-divider my-0">


            <li class="nav-item active">
                <a class="nav-link" href="/SO_Controller">
                    <i class="fas fa-fw fa-tachometer-alt"></i>
                    <span>생산목표</span></a>
            </li>

            <hr class="sidebar-divider">

            <div class="sidebar-heading">
                생산
            </div>

            <li class="nav-item">
                <a class="nav-link" href="/SO_Scheduler">
                    <i class="fas fa-fw fa-table"></i>
                    <span>생산계획 관리</span></a>
            </li>

            <hr class="sidebar-divider">

            <div class="sidebar-heading">
                발주관리
            </div>

            <li class="nav-item">
                <a class="nav-link" href="/SO_invoice">
                    <i class="fas fa-fw fa-table"></i>
                    <span>완제품 발주관리</span></a>
            </li>

            <!-- Nav Item - Tables -->
            <li class="nav-item">
                <a class="nav-link" href="/SO_purorder">
                    <i class="fas fa-fw fa-table"></i>
                    <span>부자재 발주관리</span></a>
            </li>

            <hr class="sidebar-divider d-none d-md-block">
            <div class="sidebar-heading">
                공정관리
                
                
                
                
            </div>
             <li class="nav-item">
                <a class="nav-link" href="/board">
                    <i class="fas fa-fw fa-table"></i>
                    <span>작업 지시사항 게시판</span></a>
            </li>
             <li class="nav-item">
                <a class="nav-link" href="/color">
                    <i class="fas fa-fw fa-table"></i>
                    <span>공정1 모니터링</span></a>
            </li>        
             <li class="nav-item">
                <a class="nav-link" href="/color2">
                    <i class="fas fa-fw fa-table"></i>
                    <span>공정2 모니터링</span></a>
            </li>                
             <hr class="sidebar-divider d-none d-md-block">
            <div class="sidebar-heading">
                품질검사
            </div>
             <li class="nav-item">
                <a class="nav-link" href="/visualtest">
                    <i class="fas fa-fw fa-table"></i>
                    <span>외관검사</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/centertest">
                    <i class="fas fa-fw fa-table"></i>
                    <span>중심축검사</span></a>
            </li>
                        
            <li class="nav-item">
                <a class="nav-link" href="performancetest">
                    <i class="fas fa-fw fa-table"></i>
                    <span>성능테스트</span></a>
            </li>
            <hr class="sidebar-divider d-none d-md-block">
            <div class="sidebar-heading">
                불량품 확인 게시판
            </div>            
            <li class="nav-item">
                <a class="nav-link" href="/ErrorListHTML">
                    <i class="fas fa-fw fa-table"></i>
                    <span>불량품 게시판</span></a>
            </li>
  			<hr class="sidebar-divider d-none d-md-block">                        
            <div class="sidebar-heading">
                창고관리
            </div>
            <li class="nav-item">
                <a class="nav-link" href="performancetest">
                    <i class="fas fa-fw fa-table"></i>
                    <span>창고 현상황</span></a>
            </li>                        
            <div class="text-center d-none d-md-inline">
               
            </div>

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mt-2 text-gray-800">공정 현황</h1>
                    </div>
                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <a href="/board" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">공정관리로 이동하기</a>
                    </div>

                    <!-- Content Row -->
                    <div class="row">
                        

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-4 col-md-6 mb-4">
                            <div class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">
                                                1공정 단위 생산량</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800">
    																								<c:forEach var="one" items="${one}">
        																								<p>${one.total_cnt_one}개</p>
    																									</c:forEach>
																	
																												</div>
                                        </div>
                    
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Earnings (Monthly) Card Example -->
                        <div class="col-xl-4 col-md-6 mb-4">
                            <div class="card border-left-success shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-success text-uppercase mb-1">
                                                2공정 단위 생산량</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800"><c:forEach var="two" items="${two}">
                                             													<p>${two.total_cnt_two}개</p>				
                                                                                                </c:forEach></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Earnings (Monthly) Card Example -->
                       

                        <!-- Pending Requests Card Example -->
                        <div class="col-xl-4 col-md-6 mb-4">
                            <div class="card border-left-warning shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs font-weight-bold text-warning text-uppercase mb-1">
                                                불량검출률</div>
                                            <div class="h5 mb-0 font-weight-bold text-gray-800">${tot[0].percentsum}%</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                   
                    </div>

                </div>
                <div class="row" style="padding:24px;">

                        <!-- Area Chart -->
                       <div class="card shadow col-xl-6 col-lg-5 " style="height: 415px; width: 100%; ">
                                <div class="card-header py-3" >
                                    <h6 class="m-0 font-weight-bold text-primary ml-2">총 생산량 </h6>
                                </div>
                                <div class="card-body">
                                    <h4 class="small font-weight-bold">WIND-TIRE <span
                                            class="float-right">${tot[0].totalyield}개</span></h4>
                                    <div class="progress mb-4">
                                        <div class="progress-bar bg-danger" role="progressbar" style="width: 90%"
                                            aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
                                    </div>
                                   
                                </div>
                            </div>

                        <!-- Pie Chart -->
                        <div class="col-xl-6 col-lg-10">
                            <div class="card shadow mb-4">
                                <!-- Card Header - Dropdown -->
                                <div
                                    class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6 class="m-0 font-weight-bold text-primary">부자재 수량</h6>
                                    <div class="dropdown no-arrow">
                                        <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink"
                                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <i class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
                                        </a>
                                        <div class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
                                            aria-labelledby="dropdownMenuLink">
                                            <div class="dropdown-header">Dropdown Header:</div>
                                            <a class="dropdown-item" href="#">Action</a>
                                            <a class="dropdown-item" href="#">Another action</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">Something else here</a>
                                        </div>
                                    </div>
                                </div>
                                <!-- Card Body -->
                                <div class="card-body">
                                    <div class="chart-pie pt-4 pb-2">
                                        <canvas id="myPieChart"></canvas>
                                    </div>
                                    <div class="mt-4 text-center small">
                                    <c:forEach var="name" items="${material}"><span class="mr-2">
                                            <i class="fas fa-circle text-primary"></i> ${name.mname}
                                        </span></c:forEach>
                                        
                                       
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; 2조 MES-WIND TIRE</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Bootstrap core JavaScript-->
    <script src="<%=request.getContextPath()%>/a00_com/vendor/jquery/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/a00_com/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="<%=request.getContextPath()%>/a00_com/vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="<%=request.getContextPath()%>/a00_com/js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="<%=request.getContextPath()%>/a00_com/vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="<%=request.getContextPath()%>/a00_com/js/demo/chart-area-demo.js" defer></script>
    <script>
       // Set new default font family and font color to mimic Bootstrap's default styling
		Chart.defaults.global.defaultFontFamily = 'Nunito', '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
		Chart.defaults.global.defaultFontColor = '#858796';
	    var labels = [
	        <c:forEach var="label" items="${material}" varStatus="status">
	            '${label.mname}'<c:if test="${!status.last}">,</c:if>
	        </c:forEach>
	    ];

	    // 데이터 값을 JSP에서 가져와 JavaScript 배열로 변환
	    var data = [
	        <c:forEach var="value" items="${material}" varStatus="status">
	            ${value.total}<c:if test="${!status.last}">,</c:if>
	        </c:forEach>
	    ]; 
		// Pie Chart Example
		var ctx = document.getElementById("myPieChart");
		var myPieChart = new Chart(ctx, {
  		type: 'doughnut',
  		data: {
    	labels: labels,
    	datasets: [{
      	data: data,
      	backgroundColor: ['#4e73df', '#1cc88a', '#36b9cc'],
      	hoverBackgroundColor: ['#2e59d9', '#17a673', '#2c9faf'],
      	hoverBorderColor: "rgba(234, 236, 244, 1)",
    	}],
  		},
  	options: {
    maintainAspectRatio: false,
    tooltips: {
      backgroundColor: "rgb(255,255,255)",
      bodyFontColor: "#858796",
      borderColor: '#dddfeb',
      borderWidth: 1,
      xPadding: 15,
      yPadding: 15,
      displayColors: false,
      caretPadding: 10,
    },
    legend: {
      display: false
    },
    cutoutPercentage: 80,
  },
});
    </script>
   
</body>

</html>