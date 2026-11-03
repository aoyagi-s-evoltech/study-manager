Study Manager

Java Swing を利用した学習進捗管理アプリ

概要

Java GUIアプリケーション開発の学習として作成するデスクトップアプリです。

学習記録の登録・管理・集計・可視化を通して、以下の技術習得を目指します。

Java基礎文法
オブジェクト指向
Swing GUI開発
イベント処理
コレクションフレームワーク
ファイル入出力
SQLite/JDBC
MVC設計
開発ステップ
① Swing画面作成
 JFrame作成
 JTabbedPane作成
 タブ画面作成
 入力フォーム配置
 登録ボタン配置
 レイアウト管理
② 学習記録登録
 StudyRecordクラス作成
 入力データのオブジェクト化
 ArrayListへの保存
 イベント処理の実装
③ JTable一覧表示
 学習記録一覧表示
 DefaultTableModel利用
 データ追加時の自動更新
④ CSV保存
 CSVファイル出力
 データ永続化
⑤ 集計機能
 総学習時間集計
 科目別学習時間集計
⑥ 目標管理
 学習目標時間設定
 進捗率算出
 達成状況可視化
⑦ グラフ表示
 JFreeChart導入
 棒グラフ表示
 円グラフ表示
⑧ SQLite連携
 SQLiteデータベース作成
 JDBC接続
 CRUD処理実装
⑨ ヒートマップ表示
 GitHub風学習履歴表示
 Graphics利用
画面構成
学習記録
集計
目標管理
現在の進捗
2026-11-03

初回プロジェクト作成

完了内容

MainFrame作成
JFrame作成
JTabbedPane作成
学習記録タブ作成
集計タブ作成
目標管理タブ作成
GitHubリポジトリ作成

次回予定

学習記録入力フォーム作成
JTextField追加
JButton追加
GridLayout適用
最終目標

学習記録の登録・管理・集計・可視化ができるデスクトップアプリを完成させる。

完成後は Spring Boot を用いた Web アプリ版への発展も視野に入れる。
