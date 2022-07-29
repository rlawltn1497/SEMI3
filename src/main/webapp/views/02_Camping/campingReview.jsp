<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>모닥불_자유게시판_글쓰기</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Price Slider Stylesheets -->
    <link rel="stylesheet" href="/resources/vendor/nouislider/nouislider.css">
    <!-- Google fonts - Playfair Display-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i,700">
    <!-- Google fonts - Poppins-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:300,400,400i,700">
    <!-- swiper-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.4.1/css/swiper.min.css">
    <!-- Magnigic Popup-->
    <link rel="stylesheet" href="/resources/vendor/magnific-popup/magnific-popup.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="/resources/css/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="/resources/css/custom.css">
    <!-- Favicon-->
    <link rel="shortcut icon" href="/resources/img/favicon.png">
    <!-- Tweaks for older IEs-->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <!-- 나눔고딕체 -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">
    <!-- 나눔스퀘어체 -->
    <link href="https://hangeul.pstatic.net/hangeul_static/css/nanum-square-round.css" rel="stylesheet">
</head>

<body style="padding-top: 72px;">

    <header class="header">
        <!-- 헤더 시작 -->

        <!-- 모닥불 로고-->
        <nav class="navbar navbar-expand-lg fixed-top shadow navbar-light bg-white ">
            <div class="container-fluid ms-n8 ">
                <div class="d-flex align-items-end">
                    <a class="navbar-brand py-1" href="main.html"><img src="/resources/img/img_semi/모닥불로고05.png" width="200px"></a>

                    <!-- 로고 옆 검색창 -->
                    <nav class="navbar bg-white">
                        <div class="container-fluid">
                            <form class="d-flex" role="search" href="main.html">
                                <label class="label-absolute" style="width:100px;">
                                    <i class="fa fa-search" style="padding-left: 10px;"></i></label>
                                <input class="form-control me-2 ms-xl-0" type="search" placeholder="     캠핑용품 검색" aria-label="Search">
                            </form>
                        </div>
                    </nav>
                </div>

                <!-- 헤더 메뉴바 -->
                <div class="d-inline-flex align-items-end position-static mt-n12 me-n8">
                    <div class="collapse navbar-collapse " id="navbarCollapse">
                        <ul class="navbar-nav ms-auto ">
                            <li class="nav-item"><a class="nav-link me-4" href="contact.html" style="font-size:25px; color: rgb(28, 27, 27); "> HOME </a>
                            </li>
                            <li class="nav-item"><a class="nav-link me-4" href="user-profile.html" style="font-size:25px;color: rgb(28, 27, 27)">캠핑장</a>
                            </li>
                            <li class="nav-item"><a class="nav-link me-4" href="user-profile.html" style="font-size:25px;color: rgb(28, 27, 27)">캠핑용품</a>
                            </li>
                            <li class="nav-item"><a class="nav-link me-4" href="contact.html" style="font-size:25px; color: rgb(28, 27, 27);"> 자유게시판 </a>
                            </li>
                            <li class="nav-item"><a class="nav-link me-4" href="user-profile.html" style="font-size:25px;color: rgb(28, 27, 27)">마이페이지</a>
                            </li>
                            <li class="nav-item mt-2  d-lg-none d-xl-inline-block"><a class="btn btn-primary" style="font-size: 15px;" href="user-add-0.html">로그인</a></li>
                            <li class="nav-item dropdown position-static mt-8 ">
                                <a class="nav-link " href="#" data-bs-toggle="dropdown"><img src="/resources/img/img_semi/목록01.png" style="width: 50px;"></a>
                                <div class="dropdown-menu megamenu py-lg-0">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <div class="row  pb-4 pe-lg-5 ps-lg-6 pt-lg-5">
                                                <div class="col-lg-3">
                                                    <!-- Megamenu list home-->
                                                    <h6 class="text-uppercase">모닥불</h6>
                                                    <ul class="megamenu-list list-unstyled">
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="category-rooms.html">Home  </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="category-2-rooms.html">문의 게시판   </a></li>
                                                    </ul>
                                                </div>
                                                <div class="col-lg-3">
                                                    <!-- Megamenu list-->
                                                    <h6 class="text-uppercase">캠핑장</h6>
                                                    <ul class="megamenu-list list-unstyled">
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="category-rooms.html">캠핑   </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="category-2-rooms.html">카라반   </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="category-3-rooms.html">글램핑   </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="detail-rooms.html">오토캠핑   </a></li>
                                                    </ul>
                                                </div>
                                                <div class="col-lg-3">
                                                    <!-- Megamenu list-->
                                                    <h6 class="text-uppercase">캠핑용품</h6>
                                                    <ul class="megamenu-list list-unstyled">
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="pricing.html">텐트   </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="text.html">침낭   </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="faq.html">랜턴   </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="coming-soon.html">의자테이블   </a></li>
                                                    </ul>
                                                </div>
                                                <div class="col-lg-3">
                                                    <!-- Megamenu list-->
                                                    <h6 class="text-uppercase">마이페이지</h6>
                                                    <ul class="megamenu-list list-unstyled">
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="user-profile.html">나의 정보    </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="user-account.html">찜한 캠핑장   </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="user-personal.html">예약 목록   </a></li>
                                                        <li class="megamenu-list-item"><a class="megamenu-list-link" href="user-security.html">내 게시물   </a></li>
                                                    </ul>
                                                </div>
                                            </div>
                                            <div class="row megamenu-services d-none d-lg-flex ps-lg-5">
                                                <div class="col-xl-3 col-lg-6 d-flex">
                                                    <div class="megamenu-services-item">
                                                        <svg class="svg-icon megamenu-services-icon">
                                                            <use xlink:href="#destination-map-1"> </use>
                                                             </svg>
                                                        <div>
                                                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-envelope-open" viewBox="0 0 16 16">
                                                                <path d="M8.47 1.318a1 1 0 0 0-.94 0l-6 3.2A1 1 0 0 0 1 5.4v.817l5.75 3.45L8 8.917l1.25.75L15 6.217V5.4a1 1 0 0 0-.53-.882l-6-3.2ZM15 7.383l-4.778 2.867L15 13.117V7.383Zm-.035 6.88L8 10.082l-6.965 4.18A1 1 0 0 0 2 15h12a1 1 0 0 0 .965-.738ZM1 13.116l4.778-2.867L1 7.383v5.734ZM7.059.435a2 2 0 0 1 1.882 0l6 3.2A2 2 0 0 1 16 5.4V14a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V5.4a2 2 0 0 1 1.059-1.765l6-3.2Z"/>
                                                              </svg>
                                                            <h6 class="text-uppercase">E-mail</h6>
                                                            <p class="mb-0 text-muted text-sm">KHINFO1234@gmail.com</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-xl-3 col-lg-6 d-flex">
                                                    <div class="megamenu-services-item">
                                                        <svg class="svg-icon megamenu-services-icon">
                                                            <use xlink:href="#money-box-1"> </use>
                                                         </svg>
                                                        <div>
                                                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-alarm" viewBox="0 0 16 16">
                                                                <path d="M8.5 5.5a.5.5 0 0 0-1 0v3.362l-1.429 2.38a.5.5 0 1 0 .858.515l1.5-2.5A.5.5 0 0 0 8.5 9V5.5z"/>
                                                                <path d="M6.5 0a.5.5 0 0 0 0 1H7v1.07a7.001 7.001 0 0 0-3.273 12.474l-.602.602a.5.5 0 0 0 .707.708l.746-.746A6.97 6.97 0 0 0 8 16a6.97 6.97 0 0 0 3.422-.892l.746.746a.5.5 0 0 0 .707-.708l-.601-.602A7.001 7.001 0 0 0 9 2.07V1h.5a.5.5 0 0 0 0-1h-3zm1.038 3.018a6.093 6.093 0 0 1 .924 0 6 6 0 1 1-.924 0zM0 3.5c0 .753.333 1.429.86 1.887A8.035 8.035 0 0 1 4.387 1.86 2.5 2.5 0 0 0 0 3.5zM13.5 1c-.753 0-1.429.333-1.887.86a8.035 8.035 0 0 1 3.527 3.527A2.5 2.5 0 0 0 13.5 1z"/>
                                                              </svg>
                                                            <h6 class="text-uppercase">AM09:00~PM06:00</h6>
                                                            <p class="mb-0 text-muted text-sm">고객센터 운영시간</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-xl-3 col-lg-6 d-flex">
                                                    <div class="megamenu-services-item">
                                                        <svg class="svg-icon megamenu-services-icon">
                                                                <use xlink:href="#customer-support-1"> </use>
                                                         </svg>
                                                        <div>
                                                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-telephone" viewBox="0 0 16 16">
                                                                <path d="M3.654 1.328a.678.678 0 0 0-1.015-.063L1.605 2.3c-.483.484-.661 1.169-.45 1.77a17.568 17.568 0 0 0 4.168 6.608 17.569 17.569 0 0 0 6.608 4.168c.601.211 1.286.033 1.77-.45l1.034-1.034a.678.678 0 0 0-.063-1.015l-2.307-1.794a.678.678 0 0 0-.58-.122l-2.19.547a1.745 1.745 0 0 1-1.657-.459L5.482 8.062a1.745 1.745 0 0 1-.46-1.657l.548-2.19a.678.678 0 0 0-.122-.58L3.654 1.328zM1.884.511a1.745 1.745 0 0 1 2.612.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z"/>
                                                              </svg>
                                                            <h6 class="text-uppercase">02-169-9852</h6>
                                                            <p class="mb-0 text-muted text-sm">고객센터</p>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-xl-3 col-lg-6 d-flex">
                                                    <div class="megamenu-services-item">
                                                        <svg class="svg-icon megamenu-services-icon">
                                                            <use xlink:href="#secure-payment-1"> </use>
                                                         </svg>
                                                        <div>
                                                            <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-piggy-bank" viewBox="0 0 16 16">
                                                                <path d="M5 6.25a.75.75 0 1 1-1.5 0 .75.75 0 0 1 1.5 0zm1.138-1.496A6.613 6.613 0 0 1 7.964 4.5c.666 0 1.303.097 1.893.273a.5.5 0 0 0 .286-.958A7.602 7.602 0 0 0 7.964 3.5c-.734 0-1.441.103-2.102.292a.5.5 0 1 0 .276.962z"/>
                                                                <path fill-rule="evenodd" d="M7.964 1.527c-2.977 0-5.571 1.704-6.32 4.125h-.55A1 1 0 0 0 .11 6.824l.254 1.46a1.5 1.5 0 0 0 1.478 1.243h.263c.3.513.688.978 1.145 1.382l-.729 2.477a.5.5 0 0 0 .48.641h2a.5.5 0 0 0 .471-.332l.482-1.351c.635.173 1.31.267 2.011.267.707 0 1.388-.095 2.028-.272l.543 1.372a.5.5 0 0 0 .465.316h2a.5.5 0 0 0 .478-.645l-.761-2.506C13.81 9.895 14.5 8.559 14.5 7.069c0-.145-.007-.29-.02-.431.261-.11.508-.266.705-.444.315.306.815.306.815-.417 0 .223-.5.223-.461-.026a.95.95 0 0 0 .09-.255.7.7 0 0 0-.202-.645.58.58 0 0 0-.707-.098.735.735 0 0 0-.375.562c-.024.243.082.48.32.654a2.112 2.112 0 0 1-.259.153c-.534-2.664-3.284-4.595-6.442-4.595zM2.516 6.26c.455-2.066 2.667-3.733 5.448-3.733 3.146 0 5.536 2.114 5.536 4.542 0 1.254-.624 2.41-1.67 3.248a.5.5 0 0 0-.165.535l.66 2.175h-.985l-.59-1.487a.5.5 0 0 0-.629-.288c-.661.23-1.39.359-2.157.359a6.558 6.558 0 0 1-2.157-.359.5.5 0 0 0-.635.304l-.525 1.471h-.979l.633-2.15a.5.5 0 0 0-.17-.534 4.649 4.649 0 0 1-1.284-1.541.5.5 0 0 0-.446-.275h-.56a.5.5 0 0 1-.492-.414l-.254-1.46h.933a.5.5 0 0 0 .488-.393zm12.621-.857a.565.565 0 0 1-.098.21.704.704 0 0 1-.044-.025c-.146-.09-.157-.175-.152-.223a.236.236 0 0 1 .117-.173c.049-.027.08-.021.113.012a.202.202 0 0 1 .064.199z"/>
                                                              </svg>
                                                            <h6 class="text-uppercase">123-45-6789</h6>
                                                            <p class="mb-0 text-muted text-sm">(주)모닥불 디자인하우스</p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
    </header>

    <!-- 헤더 큰 이미지 -->
    <section class="d-flex align-items-center dark-overlay bg-cover " style="background-image:  url(/resources/img/img_semi/캠핑_호수_05_01.png); height: 350px; margin: 60px;">
        <!-- 헤더 이미지 글씨 -->
        <div class="container"></div>
    </section>
    <!-- 메인이미지끝 -->

    <section class="py-10">
        <div class="container">
            <div class="col-lg-12 mb-3  mb-lg-8">
                <div class="col-md-12">
                    <div class=" fs-1 mb-3" style="text-align: center; font-weight:bolder; color: #F05945;"><img src="/resources/img/img_semi/community01.png" width="60px"> 어떤 점이 좋으셨나요? </div>
                    <div class=" fs-5 mb-1" style="text-align: center; color: gray;"><svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-check" viewBox="0 0 16 16">
                        <path d="M10.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L4.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093 3.473-4.425a.267.267 0 0 1 .02-.022z"/>
                      </svg>고객님의 소중한 후기를 작성해주세요.</div>
                    <div class=" fs-5 mb-1" style="text-align: center; color: gray;"><svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-check" viewBox="0 0 16 16">
                        <path d="M10.97 4.97a.75.75 0 0 1 1.07 1.05l-3.99 4.99a.75.75 0 0 1-1.08.02L4.324 8.384a.75.75 0 1 1 1.06-1.06l2.094 2.093 3.473-4.425a.267.267 0 0 1 .02-.022z"/>
                      </svg>무관한 후기작성 시 무통보 삭제 될 수 있습니다.</div>

                </div>
            </div>
    </section>

    <!-- 주황 구분선 -->
    <section class="pt-0 pb-3 p-print-0">
        <div class="container">
            <div class="col-lg-12 ">
                <div class="mx-8 " style="background-color:#F05945; height: 2px;">
                </div>
            </div>
        </div>
    </section>


    <!-- 게시글 작성자 -->
    <section class="pt-2 pb-4 p-print-0">
        <div class="container">
            <div class="row mx-6 mt-2">
                <div class="col-md-5 " style="font-size: 15px; font-weight:bolder;">
                    <img src="/resources/img/img_semi/campfire01.png " width="8%"> 사용자닉네임
                </div>
                <p class=" mb-0 mt-3 card-stars text-lg ">
                    <i class="fa fa-star text-warning"></i>
                    <i class="fa fa-star text-warning"></i>
                    <i class="fa fa-star text-warning"></i>
                    <i class="fa fa-star text-warning"></i>
                    <i class="fa fa-star text-warning"></i>
                </p>
            </div>
        </div>
    </section>

    <!-- 회색구분선 -->
    <section class="pt-0 pb-3 p-print-0">
        <div class="container">
            <div class="col-lg-12">
                <div class="mx-8" style="background-color:#c0c0c0; height: 0.2px;">
                </div>
            </div>
        </div>
    </section>

    <!-- 문의글  -->
    <section class="pt-0 pb-1 p-print-0">
        <div class="container">
            <div class=" mb-lg-1 ">
                <div class=" mt-4" id="leaveReview">
                    <form class="form" id="contact-form" method="get" action="#">
                        <div class="row">
                            <div class="mb-4">
                                <textarea class="form-control" rows="1" name="freeBoardTitle" id="freeBoardTitle" placeholder="제목을 입력해주세요" required="required"></textarea>
                            </div>
                            <div class="mb-4">
                                <textarea class="form-control" rows="10" name="freeBoardContact" id="freeBoardContact" placeholder="캠핑장 이용에 대한 후기를 남겨주세요." required="required"></textarea>
                            </div>
                        </div>
                        <div class="container">
                            <div class="col-lg-12 mb-3  ">
                                <button class="btn btn-primary col-lg-12 " style="width: 200px; font-size: 16px; margin-left: 550px;" type="submit">등  록</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>

    <!-- 하단 이미지바 시작-->
    <section>
        <div class="container-fluid px-0 ">
            <div class="swiper-container instagram-slider ">
                <div class="swiper-wrapper ">
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-1.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-2.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-3.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-4.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-5.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-6.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-7.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-8.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-9.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-10.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-11.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-12.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-13.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-14.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-10.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-11.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-12.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-13.jpg " alt=" "></a>
                    </div>
                    <div class="swiper-slide overflow-hidden ">
                        <a href="# "><img class="img-fluid hover-scale " src="/resources/img/instagram/instagram-14.jpg " alt=" "></a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- 하단 이미지바 끝-->

    <!-- Footer-->
    <footer class="position-relative z-index-10 d-print-none ">
        <hr size="4 ">
        <!-- Main block - menus, subscribe form-->
        <div class=" pt-4 text-muted ">
            <div class="container ">
                <div class="row ">
                    <div class="col-lg-8 ">
                        <img src="/resources/img/img_semi/모닥불로고05.png " width="100px ">
                        <p style="font-size:12px; ">서울 특별시 강남구 테헤란로 14길 6 남도빌딩 2층,3층4층 R강의실(06234)</p>
                        <p style="font-size:12px; ">Email : KHINFO1234@gmail.com</p>
                    </div>
                    <div class="col-lg-2 " style=" text-align: center; ">
                        <h6 class="text-dark ">CUSTOMER INFO</h6>
                        <p style="font-weight: bolder; color: #F05945; "> 02-169-9852</p>
                        <p style="font-size:11px; "> 평일 : 오전 09:00~오후 06:00</p>
                    </div>
                    <div class="col-lg-2 " style=" text-align: center; ">
                        <h6 class="text-dark ">BANK INFO</h6>
                        <p style="font-weight: bolder; color: #F05945; "> 123-45-6789</p>
                        <p style="font-size:11px; "> KH은행 예금주 (주)모닥불 디자인하우스</p>
                    </div>
                </div>
            </div>
        </div>

        <!-- Copyright section of the footer-->
        <div class="py-4 fw-light text-dark mb-5 ">
            <div class="col-lg-12 text-center ">
                <hr>
                <p class="text-sm mb-md-3 ">팀원소개 | 캠핑장 등록안내 | 캠핑용품등록안내 | 개인정보 취급방침 | 이용안내 | 회원이용약관</p>
                <p class="text-sm mb-md-3 ">&copy; 2021, Your company. All rights reserved.</p>
            </div>
        </div>

    </footer>
    <!-- JavaScript files-->
    <script>
        // ------------------------------------------------------- //
        //   Inject SVG Sprite - 
        //   see more here 
        //   https://css-tricks.com/ajaxing-svg-sprite/
        // ------------------------------------------------------ //
        function injectSvgSprite(path) {

            var ajax = new XMLHttpRequest();
            ajax.open("GET ", path, true);
            ajax.send();
            ajax.onload = function(e) {
                var div = document.createElement("div ");
                div.className = 'd-none';
                div.innerHTML = ajax.responseText;
                document.body.insertBefore(div, document.body.childNodes[0]);
            }
        }
        // to avoid CORS issues when viewing using file:// protocol, using the demo URL for the SVG sprite
        // use your own URL in production, please :)
        // https://demo.bootstrapious.com/directory/1-0/icons/orion-svg-sprite.svg
        //- injectSvgSprite('${path}icons/orion-svg-sprite.svg'); 
        injectSvgSprite('https://demo.bootstrapious.com/directory/1-4/icons/orion-svg-sprite.svg');
    </script>
    <!-- jQuery-->
    <script src="/resources/vendor/jquery/jquery.min.js "></script>
    <!-- Bootstrap JS bundle - Bootstrap + PopperJS-->
    <script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js "></script>
    <!-- Magnific Popup - Lightbox for the gallery-->
    <script src="/resources/vendor/magnific-popup/jquery.magnific-popup.min.js "></script>
    <!-- Smooth scroll-->
    <script src="/resources/vendor/smooth-scroll/smooth-scroll.polyfills.min.js "></script>
    <!-- Bootstrap Select-->
    <script src="/resources/vendor/bootstrap-select/js/bootstrap-select.min.js "></script>
    <!-- Object Fit Images - Fallback for browsers that don't support object-fit-->
    <script src="/resources/vendor/object-fit-images/ofi.min.js "></script>
    <!-- Swiper Carousel                       -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.4.1/js/swiper.min.js "></script>
    <script>
        var basePath = ''
    </script>
    <!-- Main Theme JS file    -->
    <script src="/resources/js/theme.js "></script>
</body>
</html>