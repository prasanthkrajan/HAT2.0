/*
 * Copyright (C) 2016 Andrius Aucinas <andrius.aucinas@hatdex.org>
 * SPDX-License-Identifier: AGPL-3.0
 *
 * This file is part of the Hub of All Things project (HAT).
 *
 * HAT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation, version 3 of
 * the License.
 *
 * HAT is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See
 * the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General
 * Public License along with this program. If not, see
 * <http://www.gnu.org/licenses/>.
 */

package hatdex.hat.api.endpoints.jsonExamples

object BundleExamples {
  val fullbundle =
    """
      |{
      |    "name": "test bundle with full data",
      |    "sources": [{
      |        "source": "bundlefibaro",
      |        "datasets": [{
      |            "name": "kitchen",
      |            "description": "Fibaro sensors from the kitchen",
      |            "fields": [
      |                {
      |                    "name": "kitchenElectricity",
      |                    "description": "electricity in the kitchen",
      |                    "fields": [
      |                        {"name": "timestamp", "description": "Timestamp of the data record", "fields": []},
      |                        {"name": "value", "description": "Instantaneouse use", "fields": []}
      |                    ]
      |                }
      |            ]
      |        }]
      |    }, {
      |        "source": "bundlefacebook",
      |        "datasets": [{
      |            "name": "event",
      |            "description": "Your Social network Events",
      |            "fields": [
      |                {"name": "name", "description": "Event Name", "fields": []},
      |                {"name": "location", "description": "Location", "fields": []},
      |                {"name": "startTime", "description": "Start Time", "fields": []},
      |                {"name": "endTime", "description": "End time", "fields": []}
      |            ]
      |        }]
      |    }]
      |}
    """.stripMargin

  val fieldSelectionsBundle =
    """
      |{
      |    "name": "test bundle with full data",
      |    "sources": [{
      |        "source": "bundlefibaro",
      |        "datasets": [{
      |            "name": "kitchen",
      |            "description": "Fibaro sensors from the kitchen",
      |            "fields": [
      |                {
      |                    "name": "kitchenElectricity",
      |                    "description": "electricity in the kitchen",
      |                    "fields": [
      |                        {"name": "value", "description": "Instantaneouse use", "fields": []}
      |                    ]
      |                }
      |            ]
      |        }]
      |    }, {
      |        "source": "bundlefacebook",
      |        "datasets": [{
      |            "name": "event",
      |            "description": "Your Social network Events",
      |            "fields": [
      |                {"name": "name", "description": "Event Name", "fields": []}
      |            ]
      |        }]
      |    }]
      |}
    """.stripMargin

  val fieldlessDataset =
    """
      |{
      |    "name": "test bundle with full data",
      |    "sources": [{
      |        "source": "bundlefibaro",
      |        "datasets": [{
      |            "name": "kitchen",
      |            "description": "Fibaro sensors from the kitchen",
      |            "fields": [
      |                {
      |                    "name": "kitchenElectricity",
      |                    "description": "electricity in the kitchen",
      |                    "fields": [
      |                        {"name": "value", "description": "Instantaneouse use", "fields": []}
      |                    ]
      |                }
      |            ]
      |        }]
      |    }, {
      |        "source": "bundlefacebook",
      |        "datasets": [{
      |            "name": "event",
      |            "description": "Your Social network Events",
      |            "fields": [ ]
      |        }]
      |    }]
      |}
    """.stripMargin


  val bundleTableKitchenWrong =
    """
      |  {
      |    "name": "Electricity in the kitchen",
      |    "table": {
      |      "name": "kitchenElectricity",
      |      "source": "bundlefibaro"
      |    }
      |  }
    """.stripMargin



  val bundleValuesExample =
    """
      |{
      |  "name": "Weekend events at home",
      |  "lastUpdated": "2016-06-08T11:02:53+01:00",
      |  "data": [{
      |    "name": "event record 2",
      |    "lastUpdated": "2016-06-08T11:02:50+01:00",
      |    "id": 5,
      |    "dateCreated": "2016-06-08T11:02:50+01:00",
      |    "tables": [{
      |      "name": "event",
      |      "source": "bundlefacebook",
      |      "lastUpdated": "2016-06-08T11:02:50+01:00",
      |      "id": 4,
      |      "dateCreated": "2016-06-08T11:02:50+01:00",
      |      "fields": [{
      |        "name": "name",
      |        "lastUpdated": "2016-06-08T11:02:50+01:00",
      |        "id": 12,
      |        "dateCreated": "2016-06-08T11:02:50+01:00",
      |        "tableId": 4,
      |        "values": [{
      |          "id": 392,
      |          "dateCreated": "2016-06-08T11:02:50+01:00",
      |          "lastUpdated": "2016-06-08T11:02:50+01:00",
      |          "value": "event name 2"
      |        }]
      |      }, {
      |        "name": "location",
      |        "lastUpdated": "2016-06-08T11:02:50+01:00",
      |        "id": 13,
      |        "dateCreated": "2016-06-08T11:02:50+01:00",
      |        "tableId": 4,
      |        "values": [{
      |          "id": 393,
      |          "dateCreated": "2016-06-08T11:02:50+01:00",
      |          "lastUpdated": "2016-06-08T11:02:50+01:00",
      |          "value": "event location 2"
      |        }]
      |      }, {
      |        "name": "startTime",
      |        "lastUpdated": "2016-06-08T11:02:50+01:00",
      |        "id": 14,
      |        "dateCreated": "2016-06-08T11:02:50+01:00",
      |        "tableId": 4,
      |        "values": [{
      |          "id": 394,
      |          "dateCreated": "2016-06-08T11:02:50+01:00",
      |          "lastUpdated": "2016-06-08T11:02:50+01:00",
      |          "value": "event startTime 2"
      |        }]
      |      }, {
      |        "name": "endTime",
      |        "lastUpdated": "2016-06-08T11:02:50+01:00",
      |        "id": 15,
      |        "dateCreated": "2016-06-08T11:02:50+01:00",
      |        "tableId": 4,
      |        "values": [{
      |          "id": 395,
      |          "dateCreated": "2016-06-08T11:02:50+01:00",
      |          "lastUpdated": "2016-06-08T11:02:50+01:00",
      |          "value": "event endTime 2"
      |        }]
      |      }]
      |    }]
      |  }, {
      |    "name": "event record 1",
      |    "lastUpdated": "2016-06-08T11:02:50+01:00",
      |    "id": 4,
      |    "dateCreated": "2016-06-08T11:02:50+01:00",
      |    "tables": [{
      |      "name": "event",
      |      "source": "bundlefacebook",
      |      "lastUpdated": "2016-06-08T11:02:50+01:00",
      |      "id": 4,
      |      "dateCreated": "2016-06-08T11:02:50+01:00",
      |      "fields": [{
      |        "name": "name",
      |        "lastUpdated": "2016-06-08T11:02:50+01:00",
      |        "id": 12,
      |        "dateCreated": "2016-06-08T11:02:50+01:00",
      |        "tableId": 4,
      |        "values": [{
      |          "id": 388,
      |          "dateCreated": "2016-06-08T11:02:50+01:00",
      |          "lastUpdated": "2016-06-08T11:02:50+01:00",
      |          "value": "event name 1"
      |        }]
      |      }, {
      |        "name": "location",
      |        "lastUpdated": "2016-06-08T11:02:50+01:00",
      |        "id": 13,
      |        "dateCreated": "2016-06-08T11:02:50+01:00",
      |        "tableId": 4,
      |        "values": [{
      |          "id": 389,
      |          "dateCreated": "2016-06-08T11:02:50+01:00",
      |          "lastUpdated": "2016-06-08T11:02:50+01:00",
      |          "value": "event location 1"
      |        }]
      |      }, {
      |        "name": "startTime",
      |        "lastUpdated": "2016-06-08T11:02:50+01:00",
      |        "id": 14,
      |        "dateCreated": "2016-06-08T11:02:50+01:00",
      |        "tableId": 4,
      |        "values": [{
      |          "id": 390,
      |          "dateCreated": "2016-06-08T11:02:50+01:00",
      |          "lastUpdated": "2016-06-08T11:02:50+01:00",
      |          "value": "event startTime 1"
      |        }]
      |      }, {
      |        "name": "endTime",
      |        "lastUpdated": "2016-06-08T11:02:50+01:00",
      |        "id": 15,
      |        "dateCreated": "2016-06-08T11:02:50+01:00",
      |        "tableId": 4,
      |        "values": [{
      |          "id": 391,
      |          "dateCreated": "2016-06-08T11:02:50+01:00",
      |          "lastUpdated": "2016-06-08T11:02:50+01:00",
      |          "value": "event endTime 1"
      |        }]
      |      }]
      |    }]
      |  }],
      |  "id": 15,
      |  "dateCreated": "2016-06-08T11:02:53+01:00",
      |  "table": {
      |    "name": "event",
      |    "source": "bundlefacebook",
      |    "lastUpdated": "2016-06-08T11:02:50+01:00",
      |    "id": 4,
      |    "dateCreated": "2016-06-08T11:02:50+01:00"
      |  }
      |}
      |
    """.stripMargin
}
