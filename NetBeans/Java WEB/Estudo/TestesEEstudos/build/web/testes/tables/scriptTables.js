$(function(){
        $('tbody tr:odd').addClass('odd');
        $('tbody tr')
            .mouseover(function(){
                $(this).addClass('over');
            })
            .mouseout(function(){
                $(this).removeClass('over');
            });
    });


