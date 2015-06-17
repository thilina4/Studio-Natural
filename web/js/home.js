//$(document).ready(function () {
//    $('.slider5').bxSlider({
//        slideWidth: 300,
//        minSlides: 3,
//        maxSlides: 3,
//        moveSlides: 3,
//        slideMargin: 10
//    });
//});

$(document).ready(function () {
    $('.customize .right').load('home.jsp');
    $('#home').click(function (event) {
        $('.customize .right').load('home.jsp');
    });
    $('#photography').click(function (event) {
        $('.customize .right').load('photography.jsp');
    });
    $('#videography').click(function (event) {
        $('.customize .right').load('videography.jsp');
    });
    $('#compliment').click(function (event) {
        $('.customize .right').load('compliment.jsp');
    });
    $('#about').click(function (event) {
        $('.customize .right').load('about.jsp');
    });
    $('#contact').click(function (event) {
        $('.customize .right').load('contact.jsp');
    });
});