<%-- 
    Document   : index
    Created on : Jun 10, 2015, 10:06:40 AM
    Author     : Thilina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <link href="css/full-slider.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="codrop/css/dialog-dean.css" />
        <link rel="stylesheet" href="custom-scroll/jquery.mCustomScrollbar.css">
        <link rel="stylesheet" type="text/css" href="codrop/css/dialog.css" />
        <link rel="stylesheet" type="text/css" href="codrop/css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="codrop/css/demo.css" />
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/home.css" rel="stylesheet">

        <script src="js/jquery-2.1.3.js"></script>
        <script src="custom-scroll/jquery.mCustomScrollbar.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="codrop/js/modernizr.custom.js"></script>
        <script src="js/home.js"></script>

    </head>
    <body>
        <div class="container-fluid" style="height: 100%">
            <div class="row customize" style="height: 100%; position: relative;">
                <!-------------------1st row 1St-colum---------------------------------->
                <div class="left">
                    <div class="row">
                        <div class="col-sm-12">
                            <img id="logo" src="images/logo.jpg" alt="logo" class="center-block" style="max-width: 100%"/>
                        </div>
                    </div>
                    <div  id="studio-natural-des" class="row">

                        <div id="desktop-view" class="col-xs-12">
                            <p id="studio-natural-des-p" class="text-center">
                                Your wedding is one of the most special and memorable occasions in your life - full 
                                of love for each other at that special time, and we find great passion in capturing and saving those 
                                memorable moments. Our style of natural photography includes a combination of photojournalism and 
                                traditional poses. And our greatest reward is seeing the joy in your eyes when you see your pictures
                            </p>
                        </div>
                        <div id="mobile-view" class="col-xs-12 cumtom-font">
                            Studio Natural.lk
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <!----------------------------Navibar- fixed----------------------------------------> 
                            <div class="sidebar-nav  navbar-fixed-top">
                                <div class="navbar navbar-default" role="navigation">
                                    <div class="navbar-header">
                                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-navbar-collapse">
                                            <span class="sr-only">Toggle navigation</span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                        </button>
                                        <span class="visible-xs navbar-brand">Menu</span>
                                    </div>
                                    <div class="navbar-collapse collapse sidebar-navbar-collapse cumtom-font">
                                        <ul class="nav navbar-nav">
                                            <li><a id="home" class="category" href="#" data-toggle="collapse" data-target=".sidebar-navbar-collapse">Home</a></li>
                                            <li  class="parent"><a class="category" href="#">Photography</a>                                              
                                                <ul class="nav navbar-nav child">
                                                    <li><a id="photography" href="#" data-toggle="collapse" data-target=".sidebar-navbar-collapse">Bridal</a></li>
                                                    <li><a id="photography" href="#" data-toggle="collapse" data-target=".sidebar-navbar-collapse">Couple</a></li>
                                                    <li><a id="photography" href="#" data-toggle="collapse" data-target=".sidebar-navbar-collapse">Story Books</a></li>
                                                    <li><a id="photography" href="#" data-toggle="collapse" data-target=".sidebar-navbar-collapse">Pre Shoot</a></li>
                                                </ul>                                                                                                
                                            </li>
                                            <script>
                                                $('.child').hide();
                                                var ul = $('.parent ul');
                                                $('.parent').mouseenter(function () {
                                                    ul.stop();
                                                    ul.slideDown();
                                                });
                                                $('.parent').mouseleave(function () {
                                                    ul.stop();
                                                    ul.slideUp();
                                                });
                                                $('.parent').click(function () {
                                                    ul.stop();
                                                    ul.slideToggle();
                                                });
                                            </script>
                                            <li><a id="videography" class="category" href="#" data-toggle="collapse" data-target=".sidebar-navbar-collapse">Videography</a></li>
                                            <li><a id="compliment" class="category" href="#" data-toggle="collapse" data-target=".sidebar-navbar-collapse">Compliments</a></li>
                                            <li><a id="about" class="category" href="#" data-toggle="collapse" data-target=".sidebar-navbar-collapse">About</a></li>
                                            <li><a id="contact" class="category" href="#" data-toggle="collapse" data-target=".sidebar-navbar-collapse">Contact</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="left-social">
                        <a href="#"><img src="images/Flat-Social-Icons-16.svg"/></a>
                        <a href="#"><img src="images/Flat-Social-Icons-17.svg"/></a>
                        <a href="#"><img src="images/Flat-Social-Icons-18.svg"/></a>
                    </div>
                    <div class="copyright">
                        Powered by Panol Technologies
                    </div>
                </div>

                <!-------------------1st-row 2nd-colum---------------------------------->
                <div class="right" style="position: absolute;">

                </div>
            </div>
        </div>
        <div style="position: absolute; width: 100%; height: 100%; bottom: 0;">
            <div id="somedialog" class="dialog">
                <div class="dialog__overlay"></div>
                <div class="dialog__content">
                    <form style="position: relative">
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" class="form-control" placeholder="Name">
                        </div>
                        <div class="form-group">
                            <label>E-mail</label>
                            <input type="email" class="form-control" placeholder="E-mail">
                        </div>
                        <div class="form-group">
                            <label>Tell about us</label>
                            <textarea class="form-control" rows="5"></textarea>
                        </div>
                        <button type="submit" class="btn btn-default" style="position: absolute;right: 0;z-index: 2;">Submit</button>
                    </form>
                    <div class="close-btn" style="position: relative">
                        <button class="action btn btn-default" id="close-button" data-dialog-close style="left: 0px;">Close</button>
                    </div>
                </div>
            </div>
        </div>
        <script src="codrop/js/classie.js"></script>
        <script src="codrop/js/dialogFx.js"></script>
        <script>
                                                (function () {

                                                    var container = document.getElementById('container'),
                                                            dlgtrigger = document.querySelector('[data-dialog]'),
                                                            somedialog = document.getElementById(dlgtrigger.getAttribute('data-dialog')),
                                                            dlg = new DialogFx(somedialog, {
                                                                onOpenDialog: function (instance) {
                                                                    classie.add(container, 'container--move');
                                                                },
                                                                onCloseDialog: function (instance) {
                                                                    classie.remove(container, 'container--move');
                                                                }
                                                            });

                                                    dlgtrigger.addEventListener('click', dlg.toggle.bind(dlg));

                                                })();

        </script>
    </body>
</html>
