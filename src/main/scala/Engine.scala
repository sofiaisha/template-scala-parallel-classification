package org.template.classification

import io.prediction.controller.EngineFactory
import io.prediction.controller.Engine

class Query(
  val Col1 : Double,
  val Col2 : Double,
  val Col3 : Double,
  val Col4 : Double,
  val Col5 : Double,
  val Col6 : Double,
  val Col7 : Double,
  val Col8 : Double,
  val Col9 : Double,
  val Col10 : Double,
  val Col21 : Double,
  val Col22 : Double,
  val Col23 : Double,
  val Col24 : Double,
  val Col25 : Double,
  val Col26 : Double,
  val Col27 : Double,
  val Col28 : Double,
  val Col29 : Double,
  val Col30 : Double,
  val Col31 : Double,
  val Col32 : Double,
  val Col33 : Double,
  val Col34 : Double,
  val Col35 : Double,
  val Col36 : Double,
  val Col37 : Double,
  val Col38 : Double,
  val Col39 : Double,
  val Col40 : Double,
  val Col41 : Double,
  val Col42 : Double,
  val Col43 : Double,
  val Col44 : Double,
  val Col45 : Double,
  val Col46 : Double,
  val Col47 : Double,
  val Col48 : Double,
  val Col49 : Double,
  val Col50 : Double,
  val Col51 : Double,
  val Col52 : Double,
  val Col53 : Double,
  val Col54 : Double,
  val Col55 : Double,
  val Col56 : Double,
  val Col57 : Double,
  val Col58 : Double,
  val Col59 : Double,
  val Col60 : Double,
  val Col61 : Double,
  val Col62 : Double,
  val Col63 : Double,
  val Col64 : Double,
  val Col65 : Double,
  val Col66 : Double,
  val Col67 : Double,
  val Col68 : Double,
  val Col69 : Double,
  val Col70 : Double,
  val Col71 : Double,
  val Col72 : Double,
  val Col73 : Double,
  val Col74 : Double,
  val Col75 : Double,
  val Col76 : Double,
  val Col77 : Double,
  val Col78 : Double,
  val Col79 : Double,
  val Col80 : Double,
  val Col81 : Double,
  val Col82 : Double,
  val Col83 : Double,
  val Col84 : Double,
  val Col85 : Double,
  val Col86 : Double,
  val Col87 : Double,
  val Col88 : Double,
  val Col89 : Double,
  val Col90 : Double,
  val Col91 : Double,
  val Col92 : Double,
  val Col93 : Double,
  val Col94 : Double,
  val Col95 : Double,
  val Col96 : Double,
  val Col97 : Double,
  val Col98 : Double,
  val Col99 : Double,
  val Col100 : Double,
  val Col101 : Double,
  val Col102 : Double,
  val Col103 : Double,
  val Col104 : Double,
  val Col105 : Double,
  val Col106 : Double,
  val Col107 : Double,
  val Col108 : Double,
  val Col109 : Double,
  val Col110 : Double,
  val Col121 : Double,
  val Col122 : Double,
  val Col123 : Double,
  val Col124 : Double,
  val Col125 : Double,
  val Col126 : Double,
  val Col127 : Double,
  val Col128 : Double,
  val Col129 : Double,
  val Col130 : Double,
  val Col131 : Double,
  val Col132 : Double,
  val Col133 : Double,
  val Col134 : Double,
  val Col135 : Double,
  val Col136 : Double,
  val Col137 : Double,
  val Col138 : Double,
  val Col139 : Double,
  val Col140 : Double,
  val Col141 : Double,
  val Col142 : Double,
  val Col143 : Double,
  val Col144 : Double,
  val Col145 : Double,
  val Col146 : Double,
  val Col147 : Double,
  val Col148 : Double,
  val Col149 : Double,
  val Col150 : Double,
  val Col151 : Double,
  val Col152 : Double,
  val Col153 : Double,
  val Col154 : Double,
  val Col155 : Double,
  val Col156 : Double,
  val Col157 : Double,
  val Col158 : Double,
  val Col159 : Double,
  val Col160 : Double,
  val Col161 : Double,
  val Col162 : Double,
  val Col163 : Double,
  val Col164 : Double,
  val Col165 : Double,
  val Col166 : Double,
  val Col167 : Double,
  val Col168 : Double,
  val Col169 : Double,
  val Col170 : Double,
  val Col171 : Double,
  val Col172 : Double,
  val Col173 : Double,
  val Col174 : Double,
  val Col175 : Double,
  val Col176 : Double,
  val Col177 : Double,
  val Col178 : Double,
  val Col179 : Double,
  val Col180 : Double,
  val Col181 : Double,
  val Col182 : Double,
  val Col183 : Double,
  val Col184 : Double,
  val Col185 : Double,
  val Col186 : Double,
  val Col187 : Double,
  val Col188 : Double,
  val Col189 : Double,
  val Col190 : Double,
  val Col191 : Double,
  val Col192 : Double,
  val Col193 : Double,
  val Col194 : Double,
  val Col195 : Double,
  val Col196 : Double,
  val Col197 : Double,
  val Col198 : Double,
  val Col199 : Double,
  val Col200 : Double,
  val Col202 : Double,
  val Col203 : Double,
  val Col204 : Double,
  val Col205 : Double,
  val Col206 : Double,
  val Col207 : Double,
  val Col208 : Double,
  val Col209 : Double,
  val Col210 : Double,
  val Col221 : Double,
  val Col222 : Double,
  val Col223 : Double,
  val Col224 : Double,
  val Col225 : Double,
  val Col226 : Double,
  val Col227 : Double,
  val Col228 : Double,
  val Col229 : Double,
  val Col230 : Double,
  val Col231 : Double,
  val Col232 : Double,
  val Col233 : Double,
  val Col234 : Double,
  val Col235 : Double,
  val Col236 : Double,
  val Col237 : Double,
  val Col238 : Double,
  val Col239 : Double,
  val Col240 : Double,
  val Col241 : Double,
  val Col242 : Double,
  val Col243 : Double,
  val Col244 : Double,
  val Col245 : Double,
  val Col246 : Double,
  val Col247 : Double,
  val Col248 : Double,
  val Col249 : Double,
  val Col250 : Double,
  val Col251 : Double,
  val Col252 : Double,
  val Col253 : Double,
  val Col254 : Double,
  val Col255 : Double,
  val Col256 : Double,
  val Col257 : Double,
  val Col258 : Double,
  val Col259 : Double,
  val Col260 : Double,
  val Col261 : Double,
  val Col262 : Double,
  val Col263 : Double,
  val Col264 : Double,
  val Col265 : Double,
  val Col266 : Double,
  val Col267 : Double,
  val Col268 : Double,
  val Col269 : Double,
  val Col270 : Double,
  val Col271 : Double,
  val Col272 : Double,
  val Col273 : Double,
  val Col274 : Double,
  val Col275 : Double,
  val Col276 : Double,
  val Col277 : Double,
  val Col278 : Double,
  val Col279 : Double,
  val Col280 : Double,
  val Col281 : Double,
  val Col282 : Double,
  val Col283 : Double,
  val Col284 : Double,
  val Col285 : Double,
  val Col286 : Double,
  val Col287 : Double,
  val Col288 : Double,
  val Col289 : Double,
  val Col290 : Double,
  val Col291 : Double,
  val Col292 : Double,
  val Col293 : Double,
  val Col294 : Double,
  val Col295 : Double,
  val Col296 : Double,
  val Col297 : Double,
  val Col298 : Double,
  val Col299 : Double,
  val Col301 : Double,
  val Col302 : Double,
  val Col303 : Double,
  val Col304 : Double,
  val Col305 : Double,
  val Col306 : Double,
  val Col307 : Double,
  val Col308 : Double,
  val Col309 : Double,
  val Col310 : Double,
  val Col321 : Double,
  val Col322 : Double,
  val Col323 : Double,
  val Col324 : Double,
  val Col325 : Double,
  val Col326 : Double,
  val Col327 : Double,
  val Col328 : Double,
  val Col329 : Double,
  val Col330 : Double,
  val Col331 : Double,
  val Col332 : Double,
  val Col333 : Double,
  val Col334 : Double,
  val Col335 : Double,
  val Col336 : Double,
  val Col337 : Double,
  val Col338 : Double,
  val Col339 : Double,
  val Col340 : Double,
  val Col341 : Double,
  val Col342 : Double,
  val Col343 : Double,
  val Col344 : Double,
  val Col345 : Double,
  val Col346 : Double,
  val Col347 : Double,
  val Col348 : Double,
  val Col349 : Double,
  val Col350 : Double,
  val Col351 : Double,
  val Col352 : Double,
  val Col353 : Double,
  val Col354 : Double,
  val Col355 : Double,
  val Col356 : Double,
  val Col357 : Double,
  val Col358 : Double,
  val Col359 : Double,
  val Col360 : Double,
  val Col361 : Double,
  val Col362 : Double,
  val Col363 : Double,
  val Col364 : Double,
  val Col365 : Double,
  val Col366 : Double,
  val Col367 : Double,
  val Col368 : Double,
  val Col369 : Double,
  val Col370 : Double,
  val Col371 : Double,
  val Col372 : Double,
  val Col373 : Double,
  val Col374 : Double,
  val Col375 : Double,
  val Col376 : Double,
  val Col377 : Double,
  val Col378 : Double,
  val Col379 : Double,
  val Col380 : Double,
  val Col381 : Double,
  val Col382 : Double,
  val Col383 : Double,
  val Col384 : Double,
  val Col385 : Double,
  val Col386 : Double,
  val Col387 : Double,
  val Col388 : Double,
  val Col389 : Double,
  val Col390 : Double,
  val Col391 : Double,
  val Col392 : Double,
  val Col393 : Double,
  val Col394 : Double,
  val Col395 : Double,
  val Col396 : Double,
  val Col397 : Double,
  val Col398 : Double,
  val Col399 : Double,
  val Col401 : Double,
  val Col402 : Double,
  val Col403 : Double,
  val Col404 : Double,
  val Col405 : Double,
  val Col406 : Double,
  val Col407 : Double,
  val Col408 : Double,
  val Col409 : Double,
  val Col410 : Double,
  val Col421 : Double,
  val Col422 : Double,
  val Col423 : Double,
  val Col424 : Double,
  val Col425 : Double,
  val Col426 : Double,
  val Col427 : Double,
  val Col428 : Double,
  val Col429 : Double,
  val Col430 : Double,
  val Col431 : Double,
  val Col432 : Double,
  val Col433 : Double,
  val Col434 : Double,
  val Col435 : Double,
  val Col436 : Double,
  val Col437 : Double,
  val Col438 : Double,
  val Col439 : Double,
  val Col440 : Double,
  val Col441 : Double,
  val Col442 : Double,
  val Col443 : Double,
  val Col444 : Double,
  val Col445 : Double,
  val Col446 : Double,
  val Col447 : Double,
  val Col448 : Double,
  val Col449 : Double,
  val Col450 : Double,
  val Col451 : Double,
  val Col452 : Double,
  val Col453 : Double,
  val Col454 : Double,
  val Col455 : Double,
  val Col456 : Double,
  val Col457 : Double,
  val Col458 : Double,
  val Col459 : Double,
  val Col460 : Double,
  val Col461 : Double,
  val Col462 : Double,
  val Col463 : Double,
  val Col464 : Double,
  val Col465 : Double,
  val Col466 : Double,
  val Col467 : Double,
  val Col468 : Double,
  val Col469 : Double,
  val Col470 : Double,
  val Col471 : Double,
  val Col472 : Double,
  val Col473 : Double,
  val Col474 : Double,
  val Col475 : Double,
  val Col476 : Double,
  val Col477 : Double,
  val Col478 : Double,
  val Col479 : Double,
  val Col480 : Double,
  val Col481 : Double,
  val Col482 : Double,
  val Col483 : Double,
  val Col484 : Double,
  val Col485 : Double,
  val Col486 : Double,
  val Col487 : Double,
  val Col488 : Double,
  val Col489 : Double,
  val Col490 : Double,
  val Col491 : Double,
  val Col492 : Double,
  val Col493 : Double,
  val Col494 : Double,
  val Col495 : Double,
  val Col496 : Double,
  val Col497 : Double,
  val Col498 : Double,
  val Col499 : Double,
  val Col501 : Double,
  val Col502 : Double,
  val Col503 : Double,
  val Col504 : Double,
  val Col505 : Double,
  val Col506 : Double,
  val Col507 : Double,
  val Col508 : Double,
  val Col509 : Double,
  val Col510 : Double,
  val Col521 : Double,
  val Col522 : Double,
  val Col523 : Double,
  val Col524 : Double,
  val Col525 : Double,
  val Col526 : Double,
  val Col527 : Double,
  val Col528 : Double,
  val Col529 : Double,
  val Col530 : Double,
  val Col531 : Double,
  val Col532 : Double,
  val Col533 : Double,
  val Col534 : Double,
  val Col535 : Double,
  val Col536 : Double,
  val Col537 : Double,
  val Col538 : Double,
  val Col539 : Double,
  val Col540 : Double,
  val Col541 : Double,
  val Col542 : Double,
  val Col543 : Double,
  val Col544 : Double,
  val Col545 : Double,
  val Col546 : Double,
  val Col547 : Double,
  val Col548 : Double,
  val Col549 : Double,
  val Col550 : Double,
  val Col551 : Double,
  val Col552 : Double,
  val Col553 : Double,
  val Col554 : Double,
  val Col555 : Double,
  val Col556 : Double,
  val Col557 : Double,
  val Col558 : Double,
  val Col559 : Double,
  val Col560 : Double,
  val Col561 : Double,
  val Col562 : Double,
) extends Serializable

class PredictedResult(
  val label: Double
) extends Serializable

class ActualResult(
  val label: Double
) extends Serializable

object ClassificationEngine extends EngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("naive" -> classOf[NaiveBayesAlgorithm]),
      classOf[Serving])
  }
}
