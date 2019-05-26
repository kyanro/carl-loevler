# Carl Loevler

## これは何？
存在しないURLを引数として渡した場合でも何かしらの応答がある carl です。
存在するURLを叩くと単なるGETの結果を文字列で返します。

## 使い方
`gradlew shadowJar`
で、`build/libs/` にjarができるのでそれを下記のように叩く

`java carl-loevler-0.1-all.jar "url"`

## なんのために使うの？
ジョークアプリだよ。
2個位の固定値しか返さないよ。
神学者の名言はかっこいいものが多いね！

## なんで作ったの？
カール・レーフラー、本当はいたのでは？みたいな気がしたので。

・・・あと、[GitHub Package Registry](https://github.com/features/package-registry) を使ってみたくてとりあえず何かしらのjarが必要だったので作った
(が、まだ使えないっぽい)