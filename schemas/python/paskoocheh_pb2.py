# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: paskoocheh.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
from google.protobuf import descriptor_pb2
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='paskoocheh.proto',
  package='org.asl19.paskoocheh',
  serialized_pb=_b('\n\x10paskoocheh.proto\x12\x14org.asl19.paskoocheh\"f\n\x07Message\x12\x0c\n\x04text\x18\x01 \x02(\t\x12\x16\n\x0e\x64\x61te_published\x18\x02 \x02(\x03\x12\x35\n\x08priority\x18\x03 \x02(\x0e\x32#.org.asl19.paskoocheh.PriorityLevel\":\n\nBinaryFile\x12\x10\n\x08\x63hecksum\x18\x01 \x02(\t\x12\x0c\n\x04size\x18\x02 \x02(\x03\x12\x0c\n\x04path\x18\x03 \x02(\t\"5\n\x03\x46\x61q\x12\x0c\n\x04lang\x18\x01 \x02(\t\x12\x10\n\x08question\x18\x02 \x02(\t\x12\x0e\n\x06\x61nswer\x18\x03 \x02(\t\">\n\x0bTranslation\x12\x0c\n\x04lang\x18\x01 \x02(\t\x12\x0c\n\x04name\x18\x02 \x02(\t\x12\x13\n\x0b\x64\x65scription\x18\x03 \x01(\t\"\xae\x02\n\x07\x43ontact\x12\x0c\n\x04name\x18\x01 \x02(\t\x12\x13\n\x0bwebsite_url\x18\x02 \x01(\t\x12\x18\n\x10user_support_url\x18\x03 \x01(\t\x12\x15\n\rsupport_email\x18\x04 \x01(\t\x12\x10\n\x08\x62log_url\x18\x05 \x01(\t\x12\x14\n\x0c\x66\x61\x63\x65\x62ook_url\x18\x06 \x01(\t\x12\x16\n\x0etwitter_handle\x18\x07 \x01(\t\x12\x10\n\x08\x66\x65\x65\x64_url\x18\x08 \x01(\t\x12\x1c\n\x14mail_responder_email\x18\t \x01(\t\x12\x12\n\nsource_url\x18\n \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x0b \x01(\t\x12\x36\n\x0btranslation\x18\x0c \x03(\x0b\x32!.org.asl19.paskoocheh.Translation\"\x9b\x01\n\x06\x43onfig\x12\x0e\n\x06\x62ucket\x18\x01 \x02(\t\x12\x0f\n\x07version\x18\x02 \x02(\t\x12\x0e\n\x06images\x18\x03 \x03(\t\x12\x31\n\tplatforms\x18\x04 \x03(\x0b\x32\x1e.org.asl19.paskoocheh.Platform\x12-\n\x06update\x18\x14 \x03(\x0b\x32\x1d.org.asl19.paskoocheh.Message\"\xc8\x01\n\x08Platform\x12\x30\n\x04name\x18\x01 \x02(\x0e\x32\".org.asl19.paskoocheh.PlatformName\x12\x30\n\x04type\x18\x02 \x02(\x0e\x32\".org.asl19.paskoocheh.PlatformType\x12)\n\x05tools\x18\x03 \x03(\x0b\x32\x1a.org.asl19.paskoocheh.Tool\x12-\n\x06update\x18\x14 \x03(\x0b\x32\x1d.org.asl19.paskoocheh.Message\"\xef\x02\n\x04Tool\x12.\n\x07\x63ontact\x18\x01 \x02(\x0b\x32\x1d.org.asl19.paskoocheh.Contact\x12-\n\x05types\x18\x02 \x03(\x0e\x32\x1e.org.asl19.paskoocheh.ToolType\x12\x0c\n\x04tags\x18\x03 \x03(\t\x12\x15\n\ris_opensource\x18\x04 \x02(\x08\x12\x16\n\x0eis_recommended\x18\x05 \x02(\x08\x12\x13\n\x0bis_featured\x18\x06 \x02(\x08\x12\'\n\x04\x66\x61qs\x18\x08 \x03(\x0b\x32\x19.org.asl19.paskoocheh.Faq\x12-\n\x06vendor\x18\t \x02(\x0b\x32\x1d.org.asl19.paskoocheh.Contact\x12/\n\x08releases\x18\n \x03(\x0b\x32\x1d.org.asl19.paskoocheh.Release\x12-\n\x06update\x18\x14 \x03(\x0b\x32\x1d.org.asl19.paskoocheh.Message\"\xdf\x02\n\x07Release\x12\x0f\n\x07version\x18\x01 \x02(\t\x12\x14\n\x0c\x64\x61te_created\x18\x02 \x02(\x03\x12\x30\n\x06\x62inary\x18\x03 \x02(\x0b\x32 .org.asl19.paskoocheh.BinaryFile\x12\x0e\n\x06rating\x18\x04 \x01(\x02\x12\x16\n\x0e\x64ownload_count\x18\x05 \x01(\x03\x12\x0c\n\x04icon\x18\x06 \x01(\t\x12\x15\n\rdate_modified\x18\x07 \x01(\x03\x12\x15\n\rdate_released\x18\x08 \x02(\x03\x12\x13\n\x0brelease_url\x18\t \x02(\t\x12\x13\n\x0bscreenshots\x18\n \x03(\t\x12\x11\n\ttutorials\x18\x0b \x03(\t\x12\x14\n\x0cpackage_name\x18\x0c \x01(\t\x12\x15\n\rbuild_version\x18\r \x01(\x05\x12-\n\x06update\x18\x14 \x03(\x0b\x32\x1d.org.asl19.paskoocheh.Message*<\n\x08ToolType\x12\x07\n\x03VPN\x10\x00\x12\t\n\x05PROXY\x10\x01\x12\r\n\tMESSENGER\x10\x02\x12\r\n\tANONIMITY\x10\x03*4\n\x0cPlatformType\x12\x0b\n\x07\x44\x45SKTOP\x10\x00\x12\n\n\x06MOBILE\x10\x01\x12\x0b\n\x07\x42ROWSER\x10\x02*\x98\x01\n\x0cPlatformName\x12\x0b\n\x07WINDOWS\x10\x00\x12\t\n\x05MACOS\x10\x01\x12\x0c\n\x08LINUX_64\x10\x02\x12\x0c\n\x08LINUX_32\x10\x03\x12\x0b\n\x07\x41NDROID\x10\x05\x12\x07\n\x03IOS\x10\x06\x12\x12\n\x0eWINDOWS_MOBILE\x10\x07\x12\n\n\x06\x43HROME\x10\n\x12\x0b\n\x07\x46IREFOX\x10\x0b\x12\x06\n\x02IE\x10\x0c\x12\t\n\x05OPERA\x10\r*.\n\rPriorityLevel\x12\x08\n\x04HIGH\x10\x00\x12\n\n\x06MEDIUM\x10\x01\x12\x07\n\x03LOW\x10\x02\x42\x05P\x01\xa0\x01\x01')
)
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

_TOOLTYPE = _descriptor.EnumDescriptor(
  name='ToolType',
  full_name='org.asl19.paskoocheh.ToolType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='VPN', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='PROXY', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MESSENGER', index=2, number=2,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='ANONIMITY', index=3, number=3,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=1715,
  serialized_end=1775,
)
_sym_db.RegisterEnumDescriptor(_TOOLTYPE)

ToolType = enum_type_wrapper.EnumTypeWrapper(_TOOLTYPE)
_PLATFORMTYPE = _descriptor.EnumDescriptor(
  name='PlatformType',
  full_name='org.asl19.paskoocheh.PlatformType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='DESKTOP', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MOBILE', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='BROWSER', index=2, number=2,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=1777,
  serialized_end=1829,
)
_sym_db.RegisterEnumDescriptor(_PLATFORMTYPE)

PlatformType = enum_type_wrapper.EnumTypeWrapper(_PLATFORMTYPE)
_PLATFORMNAME = _descriptor.EnumDescriptor(
  name='PlatformName',
  full_name='org.asl19.paskoocheh.PlatformName',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='WINDOWS', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MACOS', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='LINUX_64', index=2, number=2,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='LINUX_32', index=3, number=3,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='ANDROID', index=4, number=5,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='IOS', index=5, number=6,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='WINDOWS_MOBILE', index=6, number=7,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='CHROME', index=7, number=10,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='FIREFOX', index=8, number=11,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='IE', index=9, number=12,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='OPERA', index=10, number=13,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=1832,
  serialized_end=1984,
)
_sym_db.RegisterEnumDescriptor(_PLATFORMNAME)

PlatformName = enum_type_wrapper.EnumTypeWrapper(_PLATFORMNAME)
_PRIORITYLEVEL = _descriptor.EnumDescriptor(
  name='PriorityLevel',
  full_name='org.asl19.paskoocheh.PriorityLevel',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='HIGH', index=0, number=0,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='MEDIUM', index=1, number=1,
      options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='LOW', index=2, number=2,
      options=None,
      type=None),
  ],
  containing_type=None,
  options=None,
  serialized_start=1986,
  serialized_end=2032,
)
_sym_db.RegisterEnumDescriptor(_PRIORITYLEVEL)

PriorityLevel = enum_type_wrapper.EnumTypeWrapper(_PRIORITYLEVEL)
VPN = 0
PROXY = 1
MESSENGER = 2
ANONIMITY = 3
DESKTOP = 0
MOBILE = 1
BROWSER = 2
WINDOWS = 0
MACOS = 1
LINUX_64 = 2
LINUX_32 = 3
ANDROID = 5
IOS = 6
WINDOWS_MOBILE = 7
CHROME = 10
FIREFOX = 11
IE = 12
OPERA = 13
HIGH = 0
MEDIUM = 1
LOW = 2



_MESSAGE = _descriptor.Descriptor(
  name='Message',
  full_name='org.asl19.paskoocheh.Message',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='text', full_name='org.asl19.paskoocheh.Message.text', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='date_published', full_name='org.asl19.paskoocheh.Message.date_published', index=1,
      number=2, type=3, cpp_type=2, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='priority', full_name='org.asl19.paskoocheh.Message.priority', index=2,
      number=3, type=14, cpp_type=8, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=42,
  serialized_end=144,
)


_BINARYFILE = _descriptor.Descriptor(
  name='BinaryFile',
  full_name='org.asl19.paskoocheh.BinaryFile',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='checksum', full_name='org.asl19.paskoocheh.BinaryFile.checksum', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='size', full_name='org.asl19.paskoocheh.BinaryFile.size', index=1,
      number=2, type=3, cpp_type=2, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='path', full_name='org.asl19.paskoocheh.BinaryFile.path', index=2,
      number=3, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=146,
  serialized_end=204,
)


_FAQ = _descriptor.Descriptor(
  name='Faq',
  full_name='org.asl19.paskoocheh.Faq',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='lang', full_name='org.asl19.paskoocheh.Faq.lang', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='question', full_name='org.asl19.paskoocheh.Faq.question', index=1,
      number=2, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='answer', full_name='org.asl19.paskoocheh.Faq.answer', index=2,
      number=3, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=206,
  serialized_end=259,
)


_TRANSLATION = _descriptor.Descriptor(
  name='Translation',
  full_name='org.asl19.paskoocheh.Translation',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='lang', full_name='org.asl19.paskoocheh.Translation.lang', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='name', full_name='org.asl19.paskoocheh.Translation.name', index=1,
      number=2, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='description', full_name='org.asl19.paskoocheh.Translation.description', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=261,
  serialized_end=323,
)


_CONTACT = _descriptor.Descriptor(
  name='Contact',
  full_name='org.asl19.paskoocheh.Contact',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='org.asl19.paskoocheh.Contact.name', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='website_url', full_name='org.asl19.paskoocheh.Contact.website_url', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='user_support_url', full_name='org.asl19.paskoocheh.Contact.user_support_url', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='support_email', full_name='org.asl19.paskoocheh.Contact.support_email', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='blog_url', full_name='org.asl19.paskoocheh.Contact.blog_url', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='facebook_url', full_name='org.asl19.paskoocheh.Contact.facebook_url', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='twitter_handle', full_name='org.asl19.paskoocheh.Contact.twitter_handle', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='feed_url', full_name='org.asl19.paskoocheh.Contact.feed_url', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='mail_responder_email', full_name='org.asl19.paskoocheh.Contact.mail_responder_email', index=8,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='source_url', full_name='org.asl19.paskoocheh.Contact.source_url', index=9,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='description', full_name='org.asl19.paskoocheh.Contact.description', index=10,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='translation', full_name='org.asl19.paskoocheh.Contact.translation', index=11,
      number=12, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=326,
  serialized_end=628,
)


_CONFIG = _descriptor.Descriptor(
  name='Config',
  full_name='org.asl19.paskoocheh.Config',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='bucket', full_name='org.asl19.paskoocheh.Config.bucket', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='version', full_name='org.asl19.paskoocheh.Config.version', index=1,
      number=2, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='images', full_name='org.asl19.paskoocheh.Config.images', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='platforms', full_name='org.asl19.paskoocheh.Config.platforms', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='update', full_name='org.asl19.paskoocheh.Config.update', index=4,
      number=20, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=631,
  serialized_end=786,
)


_PLATFORM = _descriptor.Descriptor(
  name='Platform',
  full_name='org.asl19.paskoocheh.Platform',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='org.asl19.paskoocheh.Platform.name', index=0,
      number=1, type=14, cpp_type=8, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='type', full_name='org.asl19.paskoocheh.Platform.type', index=1,
      number=2, type=14, cpp_type=8, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='tools', full_name='org.asl19.paskoocheh.Platform.tools', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='update', full_name='org.asl19.paskoocheh.Platform.update', index=3,
      number=20, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=789,
  serialized_end=989,
)


_TOOL = _descriptor.Descriptor(
  name='Tool',
  full_name='org.asl19.paskoocheh.Tool',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='contact', full_name='org.asl19.paskoocheh.Tool.contact', index=0,
      number=1, type=11, cpp_type=10, label=2,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='types', full_name='org.asl19.paskoocheh.Tool.types', index=1,
      number=2, type=14, cpp_type=8, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='tags', full_name='org.asl19.paskoocheh.Tool.tags', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='is_opensource', full_name='org.asl19.paskoocheh.Tool.is_opensource', index=3,
      number=4, type=8, cpp_type=7, label=2,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='is_recommended', full_name='org.asl19.paskoocheh.Tool.is_recommended', index=4,
      number=5, type=8, cpp_type=7, label=2,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='is_featured', full_name='org.asl19.paskoocheh.Tool.is_featured', index=5,
      number=6, type=8, cpp_type=7, label=2,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='faqs', full_name='org.asl19.paskoocheh.Tool.faqs', index=6,
      number=8, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='vendor', full_name='org.asl19.paskoocheh.Tool.vendor', index=7,
      number=9, type=11, cpp_type=10, label=2,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='releases', full_name='org.asl19.paskoocheh.Tool.releases', index=8,
      number=10, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='update', full_name='org.asl19.paskoocheh.Tool.update', index=9,
      number=20, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=992,
  serialized_end=1359,
)


_RELEASE = _descriptor.Descriptor(
  name='Release',
  full_name='org.asl19.paskoocheh.Release',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='version', full_name='org.asl19.paskoocheh.Release.version', index=0,
      number=1, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='date_created', full_name='org.asl19.paskoocheh.Release.date_created', index=1,
      number=2, type=3, cpp_type=2, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='binary', full_name='org.asl19.paskoocheh.Release.binary', index=2,
      number=3, type=11, cpp_type=10, label=2,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='rating', full_name='org.asl19.paskoocheh.Release.rating', index=3,
      number=4, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='download_count', full_name='org.asl19.paskoocheh.Release.download_count', index=4,
      number=5, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='icon', full_name='org.asl19.paskoocheh.Release.icon', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='date_modified', full_name='org.asl19.paskoocheh.Release.date_modified', index=6,
      number=7, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='date_released', full_name='org.asl19.paskoocheh.Release.date_released', index=7,
      number=8, type=3, cpp_type=2, label=2,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='release_url', full_name='org.asl19.paskoocheh.Release.release_url', index=8,
      number=9, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='screenshots', full_name='org.asl19.paskoocheh.Release.screenshots', index=9,
      number=10, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='tutorials', full_name='org.asl19.paskoocheh.Release.tutorials', index=10,
      number=11, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='package_name', full_name='org.asl19.paskoocheh.Release.package_name', index=11,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='build_version', full_name='org.asl19.paskoocheh.Release.build_version', index=12,
      number=13, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
    _descriptor.FieldDescriptor(
      name='update', full_name='org.asl19.paskoocheh.Release.update', index=13,
      number=20, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      options=None),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  options=None,
  is_extendable=False,
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1362,
  serialized_end=1713,
)

_MESSAGE.fields_by_name['priority'].enum_type = _PRIORITYLEVEL
_CONTACT.fields_by_name['translation'].message_type = _TRANSLATION
_CONFIG.fields_by_name['platforms'].message_type = _PLATFORM
_CONFIG.fields_by_name['update'].message_type = _MESSAGE
_PLATFORM.fields_by_name['name'].enum_type = _PLATFORMNAME
_PLATFORM.fields_by_name['type'].enum_type = _PLATFORMTYPE
_PLATFORM.fields_by_name['tools'].message_type = _TOOL
_PLATFORM.fields_by_name['update'].message_type = _MESSAGE
_TOOL.fields_by_name['contact'].message_type = _CONTACT
_TOOL.fields_by_name['types'].enum_type = _TOOLTYPE
_TOOL.fields_by_name['faqs'].message_type = _FAQ
_TOOL.fields_by_name['vendor'].message_type = _CONTACT
_TOOL.fields_by_name['releases'].message_type = _RELEASE
_TOOL.fields_by_name['update'].message_type = _MESSAGE
_RELEASE.fields_by_name['binary'].message_type = _BINARYFILE
_RELEASE.fields_by_name['update'].message_type = _MESSAGE
DESCRIPTOR.message_types_by_name['Message'] = _MESSAGE
DESCRIPTOR.message_types_by_name['BinaryFile'] = _BINARYFILE
DESCRIPTOR.message_types_by_name['Faq'] = _FAQ
DESCRIPTOR.message_types_by_name['Translation'] = _TRANSLATION
DESCRIPTOR.message_types_by_name['Contact'] = _CONTACT
DESCRIPTOR.message_types_by_name['Config'] = _CONFIG
DESCRIPTOR.message_types_by_name['Platform'] = _PLATFORM
DESCRIPTOR.message_types_by_name['Tool'] = _TOOL
DESCRIPTOR.message_types_by_name['Release'] = _RELEASE
DESCRIPTOR.enum_types_by_name['ToolType'] = _TOOLTYPE
DESCRIPTOR.enum_types_by_name['PlatformType'] = _PLATFORMTYPE
DESCRIPTOR.enum_types_by_name['PlatformName'] = _PLATFORMNAME
DESCRIPTOR.enum_types_by_name['PriorityLevel'] = _PRIORITYLEVEL

Message = _reflection.GeneratedProtocolMessageType('Message', (_message.Message,), dict(
  DESCRIPTOR = _MESSAGE,
  __module__ = 'paskoocheh_pb2'
  # @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Message)
  ))
_sym_db.RegisterMessage(Message)

BinaryFile = _reflection.GeneratedProtocolMessageType('BinaryFile', (_message.Message,), dict(
  DESCRIPTOR = _BINARYFILE,
  __module__ = 'paskoocheh_pb2'
  # @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.BinaryFile)
  ))
_sym_db.RegisterMessage(BinaryFile)

Faq = _reflection.GeneratedProtocolMessageType('Faq', (_message.Message,), dict(
  DESCRIPTOR = _FAQ,
  __module__ = 'paskoocheh_pb2'
  # @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Faq)
  ))
_sym_db.RegisterMessage(Faq)

Translation = _reflection.GeneratedProtocolMessageType('Translation', (_message.Message,), dict(
  DESCRIPTOR = _TRANSLATION,
  __module__ = 'paskoocheh_pb2'
  # @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Translation)
  ))
_sym_db.RegisterMessage(Translation)

Contact = _reflection.GeneratedProtocolMessageType('Contact', (_message.Message,), dict(
  DESCRIPTOR = _CONTACT,
  __module__ = 'paskoocheh_pb2'
  # @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Contact)
  ))
_sym_db.RegisterMessage(Contact)

Config = _reflection.GeneratedProtocolMessageType('Config', (_message.Message,), dict(
  DESCRIPTOR = _CONFIG,
  __module__ = 'paskoocheh_pb2'
  # @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Config)
  ))
_sym_db.RegisterMessage(Config)

Platform = _reflection.GeneratedProtocolMessageType('Platform', (_message.Message,), dict(
  DESCRIPTOR = _PLATFORM,
  __module__ = 'paskoocheh_pb2'
  # @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Platform)
  ))
_sym_db.RegisterMessage(Platform)

Tool = _reflection.GeneratedProtocolMessageType('Tool', (_message.Message,), dict(
  DESCRIPTOR = _TOOL,
  __module__ = 'paskoocheh_pb2'
  # @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Tool)
  ))
_sym_db.RegisterMessage(Tool)

Release = _reflection.GeneratedProtocolMessageType('Release', (_message.Message,), dict(
  DESCRIPTOR = _RELEASE,
  __module__ = 'paskoocheh_pb2'
  # @@protoc_insertion_point(class_scope:org.asl19.paskoocheh.Release)
  ))
_sym_db.RegisterMessage(Release)


DESCRIPTOR.has_options = True
DESCRIPTOR._options = _descriptor._ParseOptions(descriptor_pb2.FileOptions(), _b('P\001\240\001\001'))
# @@protoc_insertion_point(module_scope)
