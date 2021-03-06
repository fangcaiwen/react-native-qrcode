// 既有调用扫描二维码api方法，又有生成二维码的Ui
import React, { Component } from 'react';
import { NativeModules,requireNativeComponent,View } from 'react-native';
import PropTypes from 'prop-types';


const { QrcodeModule } = NativeModules;

const QrImageViewProp = {
    name:"QrImageView",
    propTypes:{
        "size":PropTypes.number,
        "imageSrc":PropTypes.string,
        ...View.propTypes
    }
}

const RCTQrImageView = requireNativeComponent('QrImageView',QrImageViewProp,{
});

class QrImageView extends Component {
    render() {
        return (
            <RCTQrImageView {...this.props} />
        );
    }
}

export {
    QrImageView,
    QrcodeModule
};
