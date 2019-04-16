

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>4eachblog 掲示板</title>
    <link rel="stylesheet"type="text/css"href="style.css">
    
 </head>
    
<body>
<header>
    <div class="logo">
        <img src="4eachblog_logo.jpg">
        <ul>
            <li>トップ</li>
            <li>プロフィール</li>
            <li>4eachについて</li>
            <li>登録フォーム</li>
            <li>問い合わせ</li>
            <li>その他</li>
        </ul>
    </div>
</header>
<main>
    <div class="left">
    
    <h1>プログラミングに役立つ掲示板</h1>
          <h2>入力フォーム</h2>
    <form method="post" action="insert.php">
        <div>
            <label>ハンドルネーム</label>
            <br>
            <input size="50" type="text"name="handlename">
        </div>
        <div>
            <label>タイトル</label>
            <br>
            <input size="50" type="text"name="title">
        </div>
        <div>
            <label>コメント</label>
            <br>
            <textarea name="comments" rows="5" cols="50">
            </textarea>
        </div>
        <div>
            <input type="submit"class="submit"value="投稿する">         
        </div>
      
        
        
    </form>
  

    </div>
        
            
        
        
    
    <div class="right">
            <h3>人気の記事</h3>
                <p>PHP オススメ本</p>
                <p>PHP MyAdminの使い方</p>
                <p>今人気のエディタ　Top5</p>
                <p>HTMLの基礎</p>

            <h3>オススメリンク</h3>
                <p>インターノウス株式会社</p>
                <p>XAMPPのダウンロード</p>
                <p>Eclipeのダウンロード</p>
                <p>Bracketsのダウンロード</p>
        
            <h3>カテゴリ</h3>
                <p>HTML</p>
                <p>PHP</p>
                <p>MySQL</p>
                <p>JavaScript</p>

        
        </div>
</main>

<footer>
    copyright(c) internous | 4each blog is the one which provides A to Z about programming.
    </footer>

   
</body>
</html>
