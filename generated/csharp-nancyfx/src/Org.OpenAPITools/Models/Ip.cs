using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// Ip
    /// </summary>
    public sealed class Ip:  IEquatable<Ip>
    { 
        /// <summary>
        /// _Ip
        /// </summary>
        public string _Ip { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Ip.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Ip()
        {
        }

        private Ip(string _Ip)
        {
            
            this._Ip = _Ip;
            
        }

        /// <summary>
        /// Returns builder of Ip.
        /// </summary>
        /// <returns>IpBuilder</returns>
        public static IpBuilder Builder()
        {
            return new IpBuilder();
        }

        /// <summary>
        /// Returns IpBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>IpBuilder</returns>
        public IpBuilder With()
        {
            return Builder()
                ._Ip(_Ip);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Ip other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Ip.
        /// </summary>
        /// <param name="left">Compared (Ip</param>
        /// <param name="right">Compared (Ip</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Ip left, Ip right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Ip.
        /// </summary>
        /// <param name="left">Compared (Ip</param>
        /// <param name="right">Compared (Ip</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Ip left, Ip right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Ip.
        /// </summary>
        public sealed class IpBuilder
        {
            private string __Ip;

            internal IpBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Ip._Ip property.
            /// </summary>
            /// <param name="value">_Ip</param>
            public IpBuilder _Ip(string value)
            {
                __Ip = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Ip.
            /// </summary>
            /// <returns>Ip</returns>
            public Ip Build()
            {
                Validate();
                return new Ip(
                    _Ip: __Ip
                );
            }

            private void Validate()
            { 
                if (__Ip == null)
                {
                    throw new ArgumentException("_Ip is a required property for Ip and cannot be null");
                } 
            }
        }

        
    }
}