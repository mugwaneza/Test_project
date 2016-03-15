$ ->
  $.get "/persons", (person) ->
    $.each person,(index,person) ->
      $('#persons').append $("<li>").text person.name
