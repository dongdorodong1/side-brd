(function() {
//----------------------------
    /** SignIn 객체 */
//----------------------------
    const SignIn = {
        name: 'SignIn',
        init: function() {
            this.bind();
        },
        bind: function() {
            let signInBtn = document.getElementById('signIn_confirm');
            signInBtn.addEventListener('click', this.fn.signIn);
        },
        fn : {
            signIn: async function() {
                // 입력된 폼 데이터 가져오기
                const userId = document.getElementById("signIn_id").value;
                const password = document.getElementById("signIn_password").value;

                // 유효성 검사
                if (!userId || !password) {
                    alert("모든 필드를 입력해주세요.");
                    return;
                }

                // 서버로 보낼 데이터 객체 생성
                const formData = {
                    userId: userId,
                    password: password,
                };
                try {
                    const response = await fetch('/common/signIn', {
                        method: 'POST',
                        headers: {
                            'Content-Type': 'application/json'
                        },
                        body: JSON.stringify(formData)
                    })
                debugger;
                    if (!response.ok) {
                        throw new Error('네트워크 응답이 올바르지 않습니다.');
                    }

                    const data = await response.text();
                    console.log('서버 응답 데이터:', data);
                    alert("로그인이 완료되었습니다!");

                    // 로그인 완료 후 원하는 동작 추가
                    location.href = '/';
                } catch (error) {
                    console.error('Fetch 오류:', error);
                    alert("회원가입에 실패했습니다. 다시 시도해주세요.");
                }


            }
        },
        template: {
        }
    };
    window.signIn = SignIn;
//-------------------------
})();