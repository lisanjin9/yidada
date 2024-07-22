const { generateService } = require("@umijs/openapi");

generateService({
  requestLibPath: "import request from '@/request'",
  schemaPath: "http://154.8.199.160:8101/api/v2/api-docs",
  serversPath: "./src",
});
