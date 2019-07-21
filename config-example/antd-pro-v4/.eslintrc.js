const { strictEslint } = require('@umijs/fabric');

module.exports = {
  ...strictEslint,
  globals: {
    MSB_BOSS_V2: true,
    page: true,
  },
};
