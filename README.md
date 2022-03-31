# springboot_checkstyle

## git hook 설정
- pre-commit 파일 .git/hooks 폴더에 복사
- git 명령어 실행
<pre>
    <code>
        git config --add checkstyle.jar ./config/checkstyle/checkstyle-10.1-all.jar
        git config --add checkstyle.checkfile ./config/checkstyle/intellij-java-google-style.xml
    </code>
</pre>
