// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.swagger._public.modeldb.model

import scala.util.Try

import net.liftweb.json._

import ai.verta.swagger._public.modeldb.model.ArtifactTypeEnumArtifactType._
import ai.verta.swagger._public.modeldb.model.OperatorEnumOperator._
import ai.verta.swagger._public.modeldb.model.ProtobufNullValue._
import ai.verta.swagger._public.modeldb.model.TernaryEnumTernary._
import ai.verta.swagger._public.modeldb.model.ValueTypeEnumValueType._
import ai.verta.swagger.client.objects._

case class ModeldbCreateExperiment (
  artifacts: Option[List[CommonArtifact]] = None,
  attributes: Option[List[CommonKeyValue]] = None,
  date_created: Option[BigInt] = None,
  date_updated: Option[BigInt] = None,
  description: Option[String] = None,
  name: Option[String] = None,
  project_id: Option[String] = None,
  tags: Option[List[String]] = None
) extends BaseSwagger {
  def toJson(): JValue = ModeldbCreateExperiment.toJson(this)
}

object ModeldbCreateExperiment {
  def toJson(obj: ModeldbCreateExperiment): JObject = {
    new JObject(
      List[Option[JField]](
        obj.artifacts.map(x => JField("artifacts", ((x: List[CommonArtifact]) => JArray(x.map(((x: CommonArtifact) => CommonArtifact.toJson(x)))))(x))),
        obj.attributes.map(x => JField("attributes", ((x: List[CommonKeyValue]) => JArray(x.map(((x: CommonKeyValue) => CommonKeyValue.toJson(x)))))(x))),
        obj.date_created.map(x => JField("date_created", JInt(x))),
        obj.date_updated.map(x => JField("date_updated", JInt(x))),
        obj.description.map(x => JField("description", JString(x))),
        obj.name.map(x => JField("name", JString(x))),
        obj.project_id.map(x => JField("project_id", JString(x))),
        obj.tags.map(x => JField("tags", ((x: List[String]) => JArray(x.map(JString)))(x)))
      ).flatMap(x => x match {
        case Some(y) => List(y)
        case None => Nil
      })
    )
  }

  def fromJson(value: JValue): ModeldbCreateExperiment =
    value match {
      case JObject(fields) => {
        val fieldsMap = fields.map(f => (f.name, f.value)).toMap
        ModeldbCreateExperiment(
          // TODO: handle required
          artifacts = fieldsMap.get("artifacts").map((x: JValue) => x match {case JArray(elements) => elements.map(CommonArtifact.fromJson); case _ => throw new IllegalArgumentException(s"unknown type ${x.getClass.toString}")}),
          attributes = fieldsMap.get("attributes").map((x: JValue) => x match {case JArray(elements) => elements.map(CommonKeyValue.fromJson); case _ => throw new IllegalArgumentException(s"unknown type ${x.getClass.toString}")}),
          date_created = fieldsMap.get("date_created").map(JsonConverter.fromJsonInteger),
          date_updated = fieldsMap.get("date_updated").map(JsonConverter.fromJsonInteger),
          description = fieldsMap.get("description").map(JsonConverter.fromJsonString),
          name = fieldsMap.get("name").map(JsonConverter.fromJsonString),
          project_id = fieldsMap.get("project_id").map(JsonConverter.fromJsonString),
          tags = fieldsMap.get("tags").map((x: JValue) => x match {case JArray(elements) => elements.map(JsonConverter.fromJsonString); case _ => throw new IllegalArgumentException(s"unknown type ${x.getClass.toString}")})
        )
      }
      case _ => throw new IllegalArgumentException(s"unknown type ${value.getClass.toString}")
    }
}
