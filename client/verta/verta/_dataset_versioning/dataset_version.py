# -*- coding: utf-8 -*-

from __future__ import print_function

import abc

from .._tracking import entity

from .._protos.public.modeldb import DatasetVersionService_pb2 as _DatasetVersionService

from ..external import six

from .._internal_utils import (
    _utils,
)


@six.add_metaclass(abc.ABCMeta)
class DatasetVersion(entity._ModelDBEntity):
    def __init__(self, conn, conf, msg):
        super(DatasetVersion, self).__init__(conn, conf, _DatasetVersionService, "dataset-version", msg)

    def __repr__(self):
        raise NotImplementedError

    @property
    def name(self):
        self._refresh_cache()
        return self._msg.name

    @classmethod
    def _generate_default_name(cls):
        return "Proj {}".format(_utils.generate_default_name())

    @classmethod
    def _get_proto_by_id(cls, conn, id):
        raise NotImplementedError

    @classmethod
    def _get_proto_by_name(cls, conn, name, workspace):
        raise NotImplementedError("cannot get DatasetVersion by name")

    @classmethod
    def _create_proto_internal(cls, conn, dataset, dataset_blob, desc=None, tags=None, attrs=None):
        raise NotImplementedError


# NOTE: before _get_by_id, first call DatasetVersion._get_proto_by_id() to check type of dataset blob
