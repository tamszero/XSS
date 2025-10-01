- XSS 취약점이 존재하는 웹 사이트
<img width="939" height="679" alt="main" src="https://github.com/user-attachments/assets/db34caff-b7b9-4c65-a669-7895f815bdbc" />

<Stored XSS 실습 1>
- 댓글 내용 입력 칸에 스크립트 공격문 삽입

![폼에 스크립트 입력.png](attachment:09d6b776-fd94-4314-ab95-4d8cc2a5ff81:폼에_스크립트_입력.png)

- alert문 실행 성공

![StoredXss.png](attachment:2932b41e-755e-44ac-983e-80dfdf5989bd:StoredXss.png)

- DB확인한 모습

![h2디비확인.png](attachment:077db0be-00c3-4b8c-9da4-c4c408bc70b7:h2디비확인.png)

- DB에 들어와 다른 사용자에게도 영향을 미치기 때문에 페이지를 새로고침하는등의 렌더링 과정을 할 때마다  스크립트가 다시 실행된다.

<Stored XSS 실습 2>

- 닉네임에 스크립트 문 삽입

![nickname.png](attachment:1dcd706f-8427-4cd8-b2a0-16928941b5b1:nickname.png)

- 마지막 닉네임을 직접 눌러보면 스크립트 실행 성공
![nickXSS!.png](attachment:4c344b6a-8c62-4a28-85fd-5fea9f0a34f1:nickXSS!.png)


<Reflected XSS 실습>
- URL에 search 파라미터를 통해 직접 스크립트 삽입

![url삽입.png](attachment:b991ffb1-67fd-4e42-91a6-7fe07c0f6186:url삽입.png)

- alert문 실행 성공

![reflectedXSS.png](attachment:6f9a6335-1cb9-4408-a888-f1d12b82bf5d:reflectedXSS.png)

- Reflected 이기 때문에 DB에 저장되지는 않는 모습
  
