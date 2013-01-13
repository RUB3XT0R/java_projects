<html>
  <head>
    <title></title>
    <style>.qitem {
	width:126px;
	height:126px;
	border:4px solid #222;
	margin:5px 5px 5px 0;
	background: url('bg.gif') no-repeat;


	/* required to hide the image after resized */
	overflow:hidden;

	/* for child absolute position */
	position:relative;

	/* display div in line */
	float:left;
	cursor:hand; cursor:pointer;
}

	.qitem img {
		border:0;

		/* allow javascript moves the img position*/
		position:absolute;
		z-index:200;
	}

	.qitem .caption {
		position:absolute;
		z-index:0;
		color:#ccc;
		display:block;
	}

		.qitem .caption h4 {
			font-size:12px;
			padding:10px 5px 0 8px;
			margin:0;
			color:#369ead;
		}

		.qitem .caption p {
			font-size:10px;
			padding:3px 5px 0 8px;
			margin:0;
		}



/* Setting for corners */

.topLeft, .topRight, .bottomLeft, .bottomRight {
	position:absolute;
	background-repeat: no-repeat;
	float:left;
}

.topLeft {
	background-position: top left;
}

.topRight {
	background-position: top right;
}

.bottomLeft {
	background-position: bottom left;
}

.bottomRight {
	background-position: bottom right;
}

.clear {
	clear:both;
}</style>

    <script></script>
    <link rel="stylesheet" href="css/main.css" type="text/css" />
    <script language="JavaScript"  src="js/jquery-1.3.1.min.js" ></script>
    <script language="JavaScript"  src="js/jquery.easing.1.3.js" ></script>
  </head>
  <body>
    <div class="qitem">
        <a href="http://www.google.com"><img src="img/1.gif" alt="Test 1" title="" width="126" height="126"/></a>
        <span class="caption"><h4>Night Club</h4><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p></span>
    </div>

    <div class="qitem">
        <a href="#"><img src="img/2.gif" alt="Test 1" title="" width="126" height="126"/></a>
        <span class="caption"><h4>Umbrella</h4><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p></span>
    </div>

    <div class="qitem">
        <a href="#"><img src="img/4.gif" alt="Test 1" title="" width="126" height="126"/></a>
        <span class="caption"><h4>litle Blackbird</h4><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p></span>
    </div>

    <div class="qitem">
        <a href="#"><img src="img/5.gif" alt="Test 1" title="" width="126" height="126"/></a>
        <span class="caption"><h4>infinity crime</h4><p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p></span>
    </div>

    <div class="clear"></div>
  </body>
</html>
