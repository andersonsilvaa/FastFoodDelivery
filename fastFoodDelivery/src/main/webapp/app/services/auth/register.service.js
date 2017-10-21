(function () {
    'use strict';

    angular
        .module('fastFoodDeliveryApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
