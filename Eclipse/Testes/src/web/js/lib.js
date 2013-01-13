$(function () {
    $('.box').each(function() {
        var content = $(this).find('.content'),
            tab     = $('> ul li', this);
        $('div', content).eq(0).show();
        tab.click(function () {
            tab.removeClass('active');
            $(this).addClass('active');
            $('div', content).hide().eq($(this).index()).show(); 
        });
    });
});