import sbt._

object Dependencies {

  // Versions
  lazy val doobieVersion = "0.7.0"
  lazy val sparkVersion = "2.4.3"
  lazy val framelessVersion = "0.8.0"
  lazy val kindProjectorVersion = "0.10.3"
  lazy val postgresqlVersion = "42.2.6"
  lazy val betterMonadicForVersion = "0.3.0"

  lazy val kantanCsvVersion = "0.5.1"
  lazy val http4sVersion = "0.20.6"
  lazy val circeVersion = "0.11.1"
  lazy val specs2Version = "4.6.0"
  lazy val logbackVersion = "1.2.3"

  lazy val catsCoreVersion = "1.6.1"
  lazy val catsEffectVersion = "1.3.1"

  lazy val jpmmlEvaluatorVersion = "1.4.11"
  lazy val jpmmlXGBoostVersion = "1.3.11"
  lazy val jpmmlSparkmlVersion = "1.5.4"

  // Libs
  // Http4s
  val http4s_dsl = "org.http4s" %% "http4s-dsl" % http4sVersion
  val http4s_blaze_server = "org.http4s" %% "http4s-blaze-server" % http4sVersion
  val http4s_blaze_client = "org.http4s" %% "http4s-blaze-client" % http4sVersion
  val http4s_circe = "org.http4s" %% "http4s-circe" % http4sVersion

  // Cats
  val cats_core = "org.typelevel" %% "cats-core" % catsCoreVersion
  val cats_effect = "org.typelevel" %% "cats-effect" % catsEffectVersion

  // KantanCSV
  val kantan_csv = "com.nrinaudo" %% "kantan.csv" % kantanCsvVersion
  val kantan_csv_cats = "com.nrinaudo" %% "kantan.csv-cats" % kantanCsvVersion

  // Circe
  val circe_generic = "io.circe" %% "circe-generic" % circeVersion
  val circe_literal = "io.circe" %% "circe-literal" % circeVersion
  val circe_parser = "io.circe" %% "circe-parser" % circeVersion

  // Doobie
  val doobie_core = "org.tpolecat" %% "doobie-core" % doobieVersion
  val doobie_postgres = "org.tpolecat" %% "doobie-postgres" % doobieVersion
  val doobie_specs2 = "org.tpolecat" %% "doobie-specs2" % doobieVersion

  // Spark
  val spark_core = "org.apache.spark" %% "spark-core" % sparkVersion
  val spark_sql = "org.apache.spark" %% "spark-sql" % sparkVersion
  val spark_mlib = "org.apache.spark" %% "spark-mllib" % sparkVersion

  // Postgresql
  val postgresql = "org.postgresql" % "postgresql" % postgresqlVersion

  // JPMML
  val jpmml_xgboost = "org.jpmml" % "jpmml-xgboost" % jpmmlXGBoostVersion
  val jpmml_sparkml = "org.jpmml" % "jpmml-sparkml" % jpmmlSparkmlVersion
  val jpmml_evaluator = "org.jpmml" % "pmml-evaluator" % jpmmlEvaluatorVersion
  val jpmml_evaluator_extension = "org.jpmml" % "pmml-evaluator-extension" % jpmmlEvaluatorVersion

  // Specs2
  val specs2_core = "org.specs2" %% "specs2-core" % specs2Version % "test"

  // Logback
  val logback_classic = "ch.qos.logback" % "logback-classic" % logbackVersion

  // KindProjector
  val kind_projector = "org.spire-math" %% "kind-projector" % kindProjectorVersion

  // BetterMonadicFor
  val better_monadic_for = "com.olegpy" %% "better-monadic-for" % betterMonadicForVersion

  // FramelessDataset
  val frameless_dataset = "org.typelevel" %% "frameless-dataset" % framelessVersion

  // Dependencies
  val restServiceDependencies = Seq(
    http4s_dsl,
    http4s_circe,
    http4s_blaze_client,
    http4s_blaze_server,
    circe_generic,
    specs2_core,
    logback_classic,
    doobie_core,
    doobie_postgres,
    doobie_specs2,
    cats_core,
    cats_effect,
    jpmml_evaluator,
    jpmml_evaluator_extension
  )

  val eltDependencies = Seq(
    frameless_dataset,
    spark_core,
    spark_sql,
    spark_mlib,
    postgresql,
    jpmml_xgboost,
    jpmml_sparkml
  )

  val dbLoaderDependencies = Seq(
    doobie_core,
    doobie_postgres,
    doobie_specs2,
    cats_core,
    cats_effect,
    kantan_csv,
    kantan_csv_cats
  )

  val apiTestDependencies = Seq(
    http4s_dsl,
    http4s_circe,
    http4s_blaze_client,
    http4s_blaze_server,
    cats_core,
    cats_effect,
    kantan_csv,
    kantan_csv_cats,
    circe_generic,
    circe_literal,
    circe_parser
  )

}
