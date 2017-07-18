(function($){
	// hello 는 jquery 추가 기능의 함수 명이다.
	$.fn.hello=function(){ // 이렇게 쓰면 $().hello 하겠다는 의미
		// this 는 선택된 jquery object 를 가리킨다.
		this.text("hello"); // 플러그인을 만들면서 jquery의 기능을 쓸수 있다는 장점이 있어
		return this; // chain 형태로 동작 가능하게 (이걸 해줘야 콘솔창에 $("div").hello(); 를 쳐보면 undefined 가 아니라 jquery object가 뜨는 걸 볼수 있어 이걸 안해주면 undefined가 떠)
	};
})(jQuery);