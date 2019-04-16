

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
        
    <form method="post" action="insert.php">
          <h2>入力フォーム</h2>
        <div>
            <label for="name">ハンドルネーム</label>
            <br>
            <input id="name"size="50" type="text"name="handlename">
        </div>
        <div>
            <label for="title">タイトル</label>
            <br>
            <input id="title"size="50" type="text"name="title">
        </div>
        <div>
            <label for="comments">コメント</label>
            <br>
            <textarea id="comments"name="comments" rows="5" cols="50">
            </textarea>
        </div>
        <div>
            <input type="submit"class="submit"value="投稿する">         
        </div>
    </form>

          
    
        
    <?php
        
        mb_internal_encoding("utf8");
        $pdo = new PDO("mysql:dbname=akira;host=localhost;" ,"root" ,"mysql");
        $stmt=$pdo->query("select * from 4each_keijiban");
  
     while($row=$stmt->fetch()){
          
        echo"<div class='kiji'>";
        echo"<h3>".$row['title']."</h3>";
        echo"<div class='comments'>";
        echo $row['comments'];
        echo"<div class='handlename'>posted by".$row['handlename']."</div>";
        echo" </div>";
        echo" </div>";
     }
        
        
    ?>
        
    </div>
   
    
    <div class="right">
            <h4>人気の記事</h4>
                <p>PHP オススメ本</p>
                <p>PHP MyAdminの使い方</p>
                <p>今人気のエディタ　Top5</p>
                <p>HTMLの基礎</p>

            <h4>オススメリンク</h4>
                <p>インターノウス株式会社</p>
                <p>XAMPPのダウンロード</p>
                <p>Eclipeのダウンロード</p>
                <p>Bracketsのダウンロード</p>
        
            <h4>カテゴリ</h4>
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
