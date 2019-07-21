import React, { Component } from 'react'
import Link from 'umi/link';
import { connect } from 'dva';




@connect(({global}) => ({
  global
}))
class Monitor extends Component {




  render() {

    return (
      <div>
        <h1>Monitor</h1>
      </div>
    )

  }
}

export default Monitor

