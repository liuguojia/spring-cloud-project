import { queryPageConfig } from '@/services/api'



const PageConfig = {
  namespace: 'page',
  state: {
    tableConfig : [],
    columnConfig : [],
    searchConfig : [],
    dataSource : []
  },
  effects: {
    *fetchPageComponentByMenu (payload, { call, put }) {
      const response = yield call(queryPageConfig, payload.params)
      response.data.table[0].columns = response.data.column[0]

      delete response.data.table[0].childrenColumnName
      delete response.data.table[0].expandIcon
      delete response.data.table[0].expandedRowRender
      delete response.data.table[0].expandRowByClick
      delete response.data.table[0].expandedRowKeys
      delete response.data.table[0].footer
      delete response.data.table[0].defaultExpandedRowKeys
      delete response.data.table[0].defaultExpandAllRows
      delete response.data.table[0].components
      delete response.data.table[0].title
      delete response.data.table[0].id
      delete response.data.table[0].indentSize
      delete response.data.table[0].locale
      delete response.data.table[0].scroll
      delete response.data.table[0].rowClassName
      delete response.data.table[0].onHeaderRow
      delete response.data.table[0].dataSource


      const dataSource = []

      for (let i = 1; i < 50; i++) {
        dataSource.push({
          id: i,
          name: '胡彦斌',
          age: 32 + i,
          address: '西湖区湖底公园'+i+'号',
          phone : '13311111234'
        })
      }

      response.data.column[0].map(col => {

      })


      yield put({
        type: 'savePageConfig',
        payload: response.data,
      });
      yield put({
        type: 'saveDataSource',
        payload: dataSource,
      });
    }
  },
  reducers: {
    savePageConfig (state, { payload }) {
      return {
        ...state,
        tableConfig: payload.table[0],
        columnConfig: payload.column
      };
    },
    saveDataSource (state, { payload }) {
      return {
        ...state,
        dataSource: payload
      };
    },
  },
};
export default PageConfig;
